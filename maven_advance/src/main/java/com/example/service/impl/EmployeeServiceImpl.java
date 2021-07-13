package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;

  @Override
  public Employee findById(int id) {
    return employeeDao.findById(id);
  }

}
