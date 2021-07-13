package com.example.dao;

import com.example.domain.Employee;

public interface EmployeeDao {
  public Employee findById(int id);
}
