package com.xg12.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.common.util.Constants;

/**
 * 登录拦截器
 * 没有登录的用户需要先登录
 * @Project: onlinestudy
 * @File: LoginInterceptor.java
 * @Date: 2015年10月6日 下午9:39:16
 * @Author: ZHUANGZHIXUAN 
 */
public class LoginInterceptor implements HandlerInterceptor{
	
	/** 日志 */
	private final Logger logger = LoggerFactory.getLogger(getClass());

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception e)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView modelAndView) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		// 判断session是否有user对象
		HttpSession httpSession = request.getSession();
		// TODO 对于不进行拦截的链接需要采取另外的方式
		if(!"/onlinestudy/login".equals(request.getRequestURI()) && 
				httpSession.getAttribute(Constants.SESSION_USER) == null){
			logger.debug("需要先登录,ip：{}",request.getRequestURI(), request.getRemoteAddr());
			response.sendRedirect("login");
			return false;
		};
		return true;
	}


}
