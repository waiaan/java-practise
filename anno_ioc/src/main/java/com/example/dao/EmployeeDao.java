package com.example.dao;

import java.util.List;

import com.example.domain.Employee;

public interface EmployeeDao {
  List<Employee> findAll();

  Employee findById(int id);
}
