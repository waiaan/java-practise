package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public String testInterception() {
        System.out.println("test interceptor");
        return "success";
    }

    @RequestMapping("/test1")
    public String test1Interception() {
        System.out.println("test1 interceptor");
        return "success";
    }
}
