package com.example.dao.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

  @Autowired
  private QueryRunner runner;

  @Override
  public List<Employee> findAll() {
    try {
      return runner.query("select * from employees", new BeanListHandler<Employee>(Employee.class));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Employee findOneById(Integer id) {
    try {
      return runner.query("select * from employees where employee_id=?", new BeanHandler<Employee>(Employee.class), id);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void saveOne(Employee emp) {
    try {
      runner.update("insert into employees(employee_id,first_name,salary) values(?,?,?)", emp.getEmployee_id(),
          emp.getFirst_name(), emp.getSalary());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void updateOne(Employee emp) {
    try {
      runner.update("update employees set first_name=?,salary=? where employee_id=?", emp.getFirst_name(),
          emp.getSalary(), emp.getEmployee_id());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void deleteOneById(Integer id) {
    try {
      runner.update("delete from employees where employee_id=?", id);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
