package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/testException")
    public String testException(Model model) throws Exception {
        System.out.println("test exception");
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("error error");
        }

        return "success";
    }

}
