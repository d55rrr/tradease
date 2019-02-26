package com.yh.tradease.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
		
		/*	if(req.getSession().getAttribute(Constant.USER_LOGIN_ACCOUNT)==null){
				res.sendRedirect("/index.html");
				return false;
			}else{
				String account = req.getSession().getAttribute(Constant.USER_LOGIN_ACCOUNT).toString();
				if("admin".equals(account)){
					return true;
				}
				res.sendRedirect("/index.html");
				return false;
			}*/
		return true;
		
	}

}
