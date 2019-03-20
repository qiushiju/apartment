package com.zhiyou100.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("*.jsp")
public class NoUserFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		String requestURI = req.getRequestURI();
		System.out.println(requestURI);
		if("/zhiyou_apartment/".equals(requestURI)) {
			chain.doFilter(req, resp);
			return;
		}else if("/zhiyou_apartment/index.jsp".equals(requestURI)){
			chain.doFilter(req, resp);
			return;
		}
		HttpSession session = req.getSession();
		Object attribute = session.getAttribute("user");
		if(attribute!=null) {
			chain.doFilter(req, resp);
			return;
		}else{
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
