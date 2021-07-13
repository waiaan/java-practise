package com.example;

import com.example.factory.BeanFactory;
import com.example.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      EmployeeService es = (EmployeeService) BeanFactory.getBean("employeeService");
      System.out.println(es);
    }
  }
}
