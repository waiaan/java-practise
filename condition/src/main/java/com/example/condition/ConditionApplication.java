package com.example.condition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConditionApplication.class, args);
		System.out.println(context.getBean("job"));
	}

}
