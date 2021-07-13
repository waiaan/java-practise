package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDao ed;

  private int i = 0;

  @Override
  public void get() {
    ed.get();
    System.out.println(i++);
  }

}
