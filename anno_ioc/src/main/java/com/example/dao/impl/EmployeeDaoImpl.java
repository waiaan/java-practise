package com.example.dao.impl;

import com.example.dao.EmployeeDao;

import org.springframework.stereotype.Repository;

@Repository("ddd")
public class EmployeeDaoImpl implements EmployeeDao {

  @Override
  public void save() {
    System.out.println("dao-save");
  }

}
