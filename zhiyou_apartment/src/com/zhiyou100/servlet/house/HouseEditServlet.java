package com.zhiyou100.servlet.house;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.House;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;

@WebServlet("/house/edit")
public class HouseEditServlet extends HttpServlet{
	
	// 创建业务层对象
	HouseService service = new HouseServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接收id
		String hidStr = req.getParameter("hid");
		System.out.println("hid: "+hidStr);
		int hid = Integer.parseInt(hidStr);
		// 调用业务层方法
		House house = service.findHouseById(hid);
		System.out.println("根据id查房子:"+house);
		req.setAttribute("house", house);
		req.getRequestDispatcher("/view/house/edit.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		House house = new House();
		house.setHid(Integer.parseInt(req.getParameter("hid")));
		house.setHaddress(req.getParameter("haddress"));
		house.setHfloor(req.getParameter("hfloor"));
		house.setHroomNum(Integer.parseInt(req.getParameter("hroomNum")));
		house.setHarea(req.getParameter("harea"));
		house.setHdir(req.getParameter("hdir"));
		house.setHdeco(Integer.parseInt(req.getParameter("hdeco")));
		house.setHair(Integer.parseInt(req.getParameter("hair")));
		house.setHprice(Double.parseDouble(req.getParameter("hprice")));
		house.setHrentStatus(Integer.parseInt(req.getParameter("hrentStatus")));
		// 更新时间
		Date date = new Date();
		System.out.println(date);
		house.setHupdateTime(date);
		// 更新数据
		service.edit(house);
		// 更新成功,重写展示页面
		req.getRequestDispatcher("/house/list").forward(req, resp);
	}
}
