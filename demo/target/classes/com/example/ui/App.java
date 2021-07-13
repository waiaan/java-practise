package com.example.ui;

import com.example.service.EmployeeService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    EmployeeService es = (EmployeeService) ac.getBean("employeeService");
    System.out.println(es);
    es.get();
  }
}
