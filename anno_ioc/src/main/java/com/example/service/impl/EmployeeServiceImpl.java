package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  @Qualifier("ddd")
  private EmployeeDao ed;

  @Override
  public void save() {
    System.out.println("service-save");
    ed.save();
  }

}
