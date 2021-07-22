package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.domain.Account;
import com.example.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user/{id}")
public class HelloController {
    @RequestMapping(path = "/params")
    public String sayHello(@RequestParam(name = "user", required = false) String username, HttpServletRequest req,
            HttpServletResponse res) {
        System.out.println(req);
        System.out.println(res);
        System.out.println(username);
        System.out.println("params");
        return "params";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String saveUser(User user) {
        System.out.println("save user");
        System.out.println(user);
        return "params";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveAccount(@PathVariable("id") String account) {
        System.out.println("save account");
        System.out.println(account);
        return "params";
    }
}
