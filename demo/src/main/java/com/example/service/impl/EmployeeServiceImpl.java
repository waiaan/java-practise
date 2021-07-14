package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.service.EmployeeService;

import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDao ed;

  @Override
  public void get() {
    System.out.println("service impl get method");
    ed.get();
  }

  public EmployeeServiceImpl() {
    System.out.println("service impl constructor");
  }

}
