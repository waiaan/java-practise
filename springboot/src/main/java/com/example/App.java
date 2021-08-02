package com.example;

import com.example.bean.Car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(App.class, args);
        System.out.println(cac.getBean(Car.class));
    }
}
