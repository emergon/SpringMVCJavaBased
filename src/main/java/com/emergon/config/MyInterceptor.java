package com.emergon.config;

import com.emergon.entities.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        User user = (User)request.getSession().getAttribute("user");
        boolean requestToLogin = request.getRequestURI().contains("login")||
                request.getRequestURI().contains("logout");
        if(!requestToLogin && (user == null||user.getUsername()==null)){
            response.sendRedirect(request.getContextPath()+"/login");
        }
    }
    
    
}
