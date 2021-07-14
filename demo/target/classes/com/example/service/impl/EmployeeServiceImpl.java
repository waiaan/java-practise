package com.example.service.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;

  @Override
  public List<Employee> findAll() {
    return employeeDao.findAll();
  }

  @Override
  public Employee findOneById(Integer id) {
    return employeeDao.findOneById(id);
  }

  @Override
  public void saveOne(Employee emp) {
    employeeDao.saveOne(emp);
  }

  @Override
  public void updateOne(Employee emp) {
    employeeDao.updateOne(emp);
  }

  @Override
  public void deleteOneById(Integer id) {
    employeeDao.deleteOneById(id);
  }

}
