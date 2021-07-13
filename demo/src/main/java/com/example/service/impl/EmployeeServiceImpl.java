package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDao ed;

  private int i = 10;

  @Override
  public void get() {
    // ed.get();
    System.out.println("service get method");
  }

  public void setEd(EmployeeDao ed) {
    this.ed = ed;
  }

  public void init() {
    System.out.println("service init method");
  }

  public void destroy() {
    System.out.println("service destroy method");
  }

}
