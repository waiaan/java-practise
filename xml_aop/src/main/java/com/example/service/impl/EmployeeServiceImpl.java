package com.example.service.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;
// import com.example.utils.TransactionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;
  // @Autowired
  // private TransactionManager txManager;

  @Override
  public List<Employee> findAll() {
    // try {
    // txManager.begin();
    // List<Employee> emps = employeeDao.findAll();
    // txManager.commit();
    // return emps;
    // } catch (Exception e) {
    // txManager.rollback();
    // throw new RuntimeException(e);
    // } finally {
    // txManager.release();
    // }
    // int i = 1 / 0;
    return employeeDao.findAll();
  }

  @Override
  public Employee findOneById(Integer id) {
    // try {
    // txManager.begin();
    // Employee emp = employeeDao.findOneById(id);
    // txManager.commit();
    // return emp;
    // } catch (Exception e) {
    // txManager.rollback();
    // throw new RuntimeException(e);
    // } finally {
    // txManager.release();
    // }
    // int i = 1 / 0;
    return employeeDao.findOneById(id);
  }

  @Override
  public void saveOne(Employee emp) {
    // try {
    // txManager.begin();
    // employeeDao.saveOne(emp);
    // txManager.commit();
    // } catch (Exception e) {
    // txManager.rollback();
    // throw new RuntimeException(e);
    // } finally {
    // txManager.release();
    // }
    employeeDao.saveOne(emp);
  }

  @Override
  public void updateOne(Employee emp) {
    // try {
    // txManager.begin();
    // employeeDao.updateOne(emp);
    // txManager.commit();
    // } catch (Exception e) {
    // txManager.rollback();
    // throw new RuntimeException(e);
    // } finally {
    // txManager.release();
    // }
    employeeDao.updateOne(emp);
  }

  @Override
  public void deleteOneById(Integer id) {
    // try {
    // txManager.begin();
    // employeeDao.deleteOneById(id);
    // txManager.commit();
    // } catch (Exception e) {
    // txManager.rollback();
    // throw new RuntimeException(e);
    // } finally {
    // txManager.release();
    // }
    employeeDao.deleteOneById(id);
  }

  @Override
  public void transfer(String from, String to, Double amount) {
    // try {
    // txManager.begin();
    // Employee out = employeeDao.findOneByName(from);
    // Employee in = employeeDao.findOneByName(to);
    // if (out == null || in == null) {
    // throw new RuntimeException("from or to is null");
    // }
    // Double restSalary = out.getSalary() - amount;
    // if (restSalary < 0) {
    // throw new RuntimeException(from + " has no enough salary");
    // } else {
    // out.setSalary(restSalary);
    // in.setSalary(in.getSalary() + amount);
    // employeeDao.updateOne(in);
    // employeeDao.updateOne(out);
    // System.out.println("success");
    // }
    // txManager.commit();
    // } catch (Exception e) {
    // txManager.rollback();
    // throw new RuntimeException(e);
    // } finally {
    // txManager.release();
    // }
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
