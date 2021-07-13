package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.factory.BeanFactory;
import com.example.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDao ed = (EmployeeDao) BeanFactory.getBean("employeeDao");

  @Override
  public void get() {
    ed.get();
  }

}
