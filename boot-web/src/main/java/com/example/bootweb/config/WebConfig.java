package com.example.bootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration(proxyBeanMethods = false)
public class WebConfig {
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter m = new HiddenHttpMethodFilter();
        m.setMethodParam("_m");
        return m;
    }
}
