package com.example.demo;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
  @Test
  public void findById() {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // EmployeeDao ed = ac.getBean(EmployeeDao.class);
    // Employee emp = ed.findById(103);
    EmployeeService es = ac.getBean(EmployeeService.class);
    Employee emp = es.findById(110);
    System.out.println(emp);

  }
}
