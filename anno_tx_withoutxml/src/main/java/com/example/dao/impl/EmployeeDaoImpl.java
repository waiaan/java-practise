package com.example.dao.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public Employee findById(int id) {
    return jdbcTemplate.query("select employee_id,first_name,salary from employees where employee_id=?",
        new BeanPropertyRowMapper<Employee>(Employee.class), id).get(0);
  }

  @Override
  public Employee findByName(String name) {
    return jdbcTemplate.query("select employee_id,first_name,salary from employees where first_name=?",
        new BeanPropertyRowMapper<Employee>(Employee.class), name).get(0);
  }

  @Override
  public void update(Employee emp) {
    jdbcTemplate.update("update employees set salary=? where employee_id=?", emp.getSalary(), emp.getEmployee_id());
  }

}
