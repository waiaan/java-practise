package com.example.factory;

import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;

public class BeanFactory {
  public EmployeeService get() {
    return new EmployeeServiceImpl();
  }
}
