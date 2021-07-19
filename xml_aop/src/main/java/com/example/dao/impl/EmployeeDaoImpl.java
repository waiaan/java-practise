package com.example.dao.impl;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.utils.ConnectionUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

  @Autowired
  private QueryRunner runner;

  @Autowired
  private ConnectionUtils connectionUtils;

  @Override
  public List<Employee> findAll() {
    try {
      return runner.query(connectionUtils.getThreadConnection(), "select * from employees",
          new BeanListHandler<Employee>(Employee.class));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Employee findOneById(Integer id) {
    try {
      return runner.query(connectionUtils.getThreadConnection(), "select * from employees where employee_id=?",
          new BeanHandler<Employee>(Employee.class), id);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void saveOne(Employee emp) {
    try {
      runner.update(connectionUtils.getThreadConnection(),
          "insert into employees(employee_id,first_name,salary) values(?,?,?)", emp.getEmployee_id(),
          emp.getFirst_name(), emp.getSalary());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void updateOne(Employee emp) {
    try {
      runner.update(connectionUtils.getThreadConnection(),
          "update employees set first_name=?,salary=? where employee_id=?", emp.getFirst_name(), emp.getSalary(),
          emp.getEmployee_id());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void deleteOneById(Integer id) {
    try {
      runner.update(connectionUtils.getThreadConnection(), "delete from employees where employee_id=?", id);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Employee findOneByName(String name) {
    try {
      List<Employee> emps = runner.query(connectionUtils.getThreadConnection(),
          "select * from employees where first_name=?", new BeanListHandler<Employee>(Employee.class), name);
      if (emps.size() != 1) {
        throw new RuntimeException(name + " is more than 1 or not found");
      } else {
        return emps.get(0);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
