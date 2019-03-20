package com.zhiyou100.servlet.house;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/house/detatil")
public class HouseDetailSevlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接收页面传递的id
		String hid = req.getParameter("hid");
		System.out.println(hid);
		// 跳转到展现详情页面
		req.getRequestDispatcher("/view/house/detail.jsp").forward(req, resp);
	}
}
