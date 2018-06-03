package com.study.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;

public class LoginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;

		HttpSession httpSession = httpRequest.getSession(false);
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		if (httpRequest.getServletPath().equals("/") || httpRequest.getServletPath().equals("/login")) {
			chain.doFilter(request, response);
		} else if (httpSession == null) {
			httpRequest.getRequestDispatcher("/").forward(httpRequest, httpResponse);
			return;
		} else if (httpSession != null && httpSession.getAttribute("username") == null) {
			httpRequest.getRequestDispatcher("/").forward(httpRequest, httpResponse);
			return;
		}
		chain.doFilter(request, response);
	}

	public void destroy() {

	}

}
