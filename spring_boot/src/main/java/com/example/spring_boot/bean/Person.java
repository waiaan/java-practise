package com.example.spring_boot.bean;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@ToString
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private String name;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private String[] interests;
}
