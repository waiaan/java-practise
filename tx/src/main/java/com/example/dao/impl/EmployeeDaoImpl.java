package com.example.dao.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

  @Override
  public Employee findById(int id) {
    return getJdbcTemplate().query("select employee_id,first_name,salary from employees where employee_id=?",
        new BeanPropertyRowMapper<Employee>(Employee.class), id).get(0);
  }

  @Override
  public Employee findByName(String name) {
    return getJdbcTemplate().query("select employee_id,first_name,salary from employees where first_name=?",
        new BeanPropertyRowMapper<Employee>(Employee.class), name).get(0);
  }

  @Override
  public void update(Employee emp) {
    getJdbcTemplate().update("update employees set salary=? where employee_id=?", emp.getSalary(),
        emp.getEmployee_id());
  }

}
