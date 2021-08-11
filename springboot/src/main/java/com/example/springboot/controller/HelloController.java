package com.example.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Component
    @ConfigurationProperties(prefix = "person")
    class Person {
        private String name;
        private Integer age;
        private String[] books;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [age=" + age + ", books=" + Arrays.toString(books) + ", name=" + name + "]";
        }

        public String[] getBooks() {
            return books;
        }

        public void setBooks(String[] books) {
            this.books = books;
        }
    }

    @Autowired
    private Person env;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(env);
        return "aaa";
    }
}
