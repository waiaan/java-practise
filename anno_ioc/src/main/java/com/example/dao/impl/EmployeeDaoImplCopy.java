package com.example.dao.impl;

import com.example.dao.EmployeeDao;

import org.springframework.stereotype.Repository;

@Repository("ed")
public class EmployeeDaoImplCopy implements EmployeeDao {

  @Override
  public void save() {
    System.out.println("dao-save-copy");
  }

}
