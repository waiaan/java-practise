package com.example.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor2 implements HandlerInterceptor {

    // @Override
    // public void afterCompletion(HttpServletRequest request, HttpServletResponse
    // response, Object handler, Exception ex)
    // throws Exception {

    // HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    // }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("post hanlder 2");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("pre hanlder 2");
        return true;
    }

}
