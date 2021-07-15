package com.example.service.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;
import com.example.utils.TransactionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;
  @Autowired
  private TransactionManager txManager;

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

  @Override
  public void transfer(String from, String to, Double amount) {
    Employee out = employeeDao.findOneByName(from);
    Employee in = employeeDao.findOneByName(to);
    if (out == null || in == null) {
      throw new RuntimeException("from or to is null");
    }
    Double restSalary = out.getSalary() - amount;
    if (restSalary < 0) {
      throw new RuntimeException(from + " has no enough salary");
    } else {
      out.setSalary(restSalary);
      in.setSalary(in.getSalary() + amount);
      employeeDao.updateOne(in);
      employeeDao.updateOne(out);
      System.out.println("success");
    }
  }

}
