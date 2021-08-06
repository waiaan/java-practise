package com.example.bootweb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}")
    public Map<String, Object> getCar(@RequestParam("user") String name,
            @RequestParam(name = "age", required = false) Integer age) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        return map;
    }
}
