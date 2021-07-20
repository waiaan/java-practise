package com.example.dao.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

  @Autowired
  private QueryRunner runner;

  @Override
  public List<Employee> findAll() {
    System.out.println(runner);
    return null;
  }

  @Override
  public Employee findById(int id) {
    return null;
  }

}
