package com.zhiyou100.servlet.house;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhiyou100.model.House;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
import com.zhiyou100.util.PageUtil;

@WebServlet("/house/list")
public class HouseListServlet extends HttpServlet{
	// 创建业务层对象
	HouseService service = new HouseServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 设置编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		// 获得关键字
		String keywords = req.getParameter("keywords");
		System.out.println("关键字:"+keywords);
		// 获得搜索字段
		String filed = req.getParameter("filed");
		System.out.println("字段:"+filed);
//		HttpSession session = req.getSession();
//		if("get".equalsIgnoreCase(req.getMethod())){
//			keywords = (String) session.getAttribute("keywords");
//			filed = (String) session.getAttribute("filed");
//		}
		// 如果是第一次,关键字为null
		if(keywords==null){
			keywords = "";
			filed = "";
		}
		// 根据搜索关键字得到数据总条数
		int total = service.count(keywords,filed);
		System.out.println("bebug --> 总条数:"+total);
		String method = req.getMethod();
		System.out.println(method);
		// 获取当前页
		String pageNo = req.getParameter("pageNo");
		if(pageNo == null){
			pageNo="1";
		}
		int pageNow = Integer.parseInt(pageNo);
		// 利用分页工具
		PageUtil page = new PageUtil(pageNow, total);
		// 根据搜索关键字调用业务层方法,
		List<House> houses = service.findAll(page,keywords,filed);
		// DEBUG
		for (House house : houses) {
			System.out.println("debug---> "+house);
		}
		// 将数据放进请求域
//		session.setAttribute("keywords", keywords);
//		session.setAttribute("filed", filed);
		req.setAttribute("keywords", keywords);
		req.setAttribute("filed", filed);
		req.setAttribute("page", page);
		req.setAttribute("houses", houses);
		req.getRequestDispatcher("/view/house/list.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
