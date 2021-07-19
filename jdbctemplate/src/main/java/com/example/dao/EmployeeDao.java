package com.example.dao;

import com.example.domain.Employee;

public interface EmployeeDao {
  Employee findById(int id);

  Employee findByName(String name);

  void update(Employee emp);
}
