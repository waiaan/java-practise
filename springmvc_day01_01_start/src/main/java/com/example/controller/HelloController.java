package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(path = "/params")
    public String sayHello(String user, String password) {
        System.out.println(user);
        System.out.println(password);
        System.out.println("hello");
        return "params";
    }
}
