package com.zhiyou100.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;
import com.zhiyou100.service.impl.LoginServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	// 创建业务层对象
	LoginService service = new LoginServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接收登录参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("debug  --> "+username+"  "+password);
		// 调用业务方法,传递数据
		User user = service.findUserByUsername(username);
		System.out.println("debug  --> "+user);
		// 得到sesseion对象
		HttpSession session = req.getSession();
		if(user==null){
			// 向session填错误信息,并跳转登录页面
			session.setAttribute("error", "用户不存在");
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}else if(!user.getUpassword().equals(password)){
			// 向session填错误信息,并跳转登录页面
			session.setAttribute("error", "密码不正确");
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}else{
			// 将对象信息放进session域,跳转首页,首页展示全部房屋信息
			session.setAttribute("user", user);
			// 跳转首页
			req.getRequestDispatcher("admin.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}
}	
