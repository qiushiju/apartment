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

import org.apache.log4j.Logger;

import com.zhiyou100.model.User;
import com.zhiyou100.test.TestLog4j;

@WebFilter(urlPatterns = { "*.jsp","/house/*","/user/*","/role/*" })
public class LoginFilter implements Filter {
	private static Logger logger = Logger.getLogger(LoginFilter.class);
// log4j
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.debug("filter 执行了");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		// 获得请求路径
		String requestURI = req.getRequestURI();
		// 如果是登录页面,放行
		if("/zhiyou_apartment/index.jsp".equals(requestURI)){
			chain.doFilter(req, resp);
		}else{
			// 如果不是登录页,从请求获得session
			HttpSession session = req.getSession();
			// 从session中获得对象信息
			User user = (User) session.getAttribute("user");
			// 如果存在对象,说明已经登录
			if(user!=null){
				// 放行
				chain.doFilter(req, resp);
			}else{
				// 如果不存在的话,跳转登录页面
				resp.sendRedirect(req.getContextPath()+"/index.jsp");
			}
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void destroy() {
	}

}
