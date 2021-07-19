package com.example.ui;

import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    EmployeeService es = ac.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
    es.save();
  }
}
