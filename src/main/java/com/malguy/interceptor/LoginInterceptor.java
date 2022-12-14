package com.malguy.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session中的用户信息
        HttpSession session=request.getSession();
        Object user = session.getAttribute("user");
        if(user==null){
            response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }
        return true;
    }
}
