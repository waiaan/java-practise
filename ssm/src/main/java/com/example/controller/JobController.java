package com.example.controller;

import com.example.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService js;

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("controller findAll");
        js.findAll();
        return "success";
    }
}
