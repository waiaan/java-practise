package com.example.config;

import com.example.bean.Car;
import com.example.bean.Pet;
import com.example.bean.User;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @EnableConfigurationProperties(Car.class)
public class MyConf {

    @Bean
    public User user01() {
        User user = new User();
        user.setAge(18);
        user.setName("A User");
        user.setPet(pet01());
        return user;
    }

    @Bean
    public Pet pet01() {
        Pet pet = new Pet();
        pet.setName("A Pet");
        return pet;
    }
}
