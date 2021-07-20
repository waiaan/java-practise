package com.example.service.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao ed;

  @Override
  public List<Employee> findAll() {
    return ed.findAll();
  }

  @Override
  public Employee findById(int id) {
    return ed.findById(id);
  }

}
