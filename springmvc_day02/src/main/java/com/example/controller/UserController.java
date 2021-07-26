package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    // @RequestMapping("/testString")
    // public String testString(Model model) {
    // System.out.println("test string");
    // User user = new User();
    // user.setUsername("Tom");
    // user.setPassword("123");
    // user.setAge(26);
    // model.addAttribute("user", user);
    // return "success";
    // }

    // @RequestMapping("/testString")
    // public void testString(HttpServletRequest req, HttpServletResponse res)
    // throws Exception {
    // System.out.println("test void");
    // res.getWriter().print("null");
    // return;
    // }

    // @RequestMapping("/testString")
    // public ModelAndView testString() throws Exception {
    // System.out.println("test model and view");
    // User user = new User();
    // user.setUsername("Jack");
    // user.setPassword("123");
    // user.setAge(26);
    // ModelAndView mv = new ModelAndView();
    // mv.addObject("user", user);
    // mv.setViewName("success");
    // return mv;
    // }

    @RequestMapping("/testString")
    public ModelAndView testString() throws Exception {
        System.out.println("test json");

        return null;
    }
}
