package com.example.ui;

import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.SpringConfig;

public class Client {
  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
    EmployeeService es = ac.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
    // es.findAll();
    System.out.println(es);
  }
}
