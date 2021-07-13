package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.dao.impl.EmployeeDaoImpl;
import com.example.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDao ed = new EmployeeDaoImpl();

  private int i = 0;

  @Override
  public void get() {
    ed.get();
    System.out.println(i++);
  }

}
