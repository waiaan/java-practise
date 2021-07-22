package com.example.controller;

import com.example.domain.Account;
import com.example.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(path = "/params")
    public String sayHello() {
        System.out.println("params");
        return "params";
    }

    @RequestMapping(path = "/saveUser")
    public String saveUser(User user) {
        System.out.println("save user");
        System.out.println(user);
        return "params";
    }

    @RequestMapping(path = "/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("save account");
        System.out.println(account);
        return "params";
    }
}
