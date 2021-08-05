package com.example.spring_boot.controller;

import com.example.spring_boot.bean.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public Person test01() {
        System.out.println(person);
        return person;
    }
}
