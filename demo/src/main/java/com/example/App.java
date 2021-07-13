package com.example;

import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    EmployeeService es = new EmployeeServiceImpl();
    es.get();
  }
}
