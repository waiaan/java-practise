package com.example.bootweb.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FormTestController {
    @GetMapping("/form.html")
    public String goTo() {
        return "form";
    }

    @ResponseBody
    @PostMapping("upload")
    public String upload(@RequestParam("name") String name, @RequestParam("age") String age,
            @RequestPart("file1") MultipartFile file1, @RequestPart("file2") MultipartFile[] file2) throws Exception {
        if (!file1.isEmpty()) {
            file1.transferTo(new File("D:/111", file1.getOriginalFilename()));
        }
        for (MultipartFile f : file2) {
            if (!f.isEmpty()) {
                f.transferTo(new File("D:/222", f.getOriginalFilename()));
            }
        }
        return name + " " + age;
    }
}
