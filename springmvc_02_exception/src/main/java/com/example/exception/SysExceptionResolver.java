package com.example.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse res, Object handler, Exception e) {
        SysException sysException = null;
        if (e instanceof SysException) {
            sysException = (SysException) e;
        } else {
            sysException = new SysException("eeee");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", sysException.getMessage());
        mv.setViewName("error");
        return mv;
    }

}
