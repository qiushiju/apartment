package com.zhiyou100.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	// a标签点击进入退出servlet,需要用doget接收
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 退出前,销毁session
		HttpSession session = req.getSession();
		// 销毁session
		session.invalidate();
		// 退出到登录页面
		resp.sendRedirect(req.getContextPath()+"/index.jsp");
	}
}
