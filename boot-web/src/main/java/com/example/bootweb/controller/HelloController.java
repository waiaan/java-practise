package com.example.bootweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {

    @GetMapping
    public String getUser(@RequestParam("username") String name) {
        System.out.println(name);
        return "get " + name;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveUser() {
        return "save";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String putUser() {
        return "put";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteUser() {
        return "delete";
    }
}
