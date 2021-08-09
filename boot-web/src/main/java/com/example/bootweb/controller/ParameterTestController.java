package com.example.bootweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ParameterTestController {

    @ResponseBody
    @GetMapping("/car/{id}")
    public Map<String, Object> getCar(@RequestBody String content) {
        Map<String, Object> map = new HashMap<>();
        System.out.println(content);
        map.put("aa", content);
        return map;
    }

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest req) {
        req.setAttribute("msg", "test attr");
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public String success(@RequestAttribute("msg") String msg) {

        return msg;
    }

    @ResponseBody
    @GetMapping("/cars/sell")
    public Map<String, Object> sellCars(@MatrixVariable("price") Integer price, @MatrixVariable("brand") String brand) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("price", price);
        map.put("brand", brand);
        return map;
    }
}
