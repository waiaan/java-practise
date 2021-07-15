package com.example.dao;

import java.util.List;

import com.example.domain.Employee;

public interface EmployeeDao {
  List<Employee> findAll();

  Employee findOneById(Integer id);

  void saveOne(Employee emp);

  void updateOne(Employee emp);

  void deleteOneById(Integer id);

  Employee findOneByName(String name);
}