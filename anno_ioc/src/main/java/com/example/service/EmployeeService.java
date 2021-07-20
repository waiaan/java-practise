package com.example.service;

import java.util.List;

import com.example.domain.Employee;

public interface EmployeeService {
  List<Employee> findAll();

  Employee findById(int id);

}