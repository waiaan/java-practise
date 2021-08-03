package com.example;

import com.example.bean.Car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
// @SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(App.class, args);
        System.out.println(cac.getBean(Car.class));

    }
}
