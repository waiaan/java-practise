package com.example.service;

import java.util.List;

import com.example.domain.Employee;

public interface EmployeeService {
  List<Employee> findAll();

  Employee findOneById(Integer id);

  void saveOne(Employee emp);

  void updateOne(Employee emp);

  void deleteOneById(Integer id);

  void transfer(String from, String to, Double amount);
}
