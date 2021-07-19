package com.example.dao.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

  private JdbcTemplate jt;

  @Override
  public Employee findById(int id) {
    return jt.query("select employee_id,first_name,salary from employees where employee_id=?",
        new BeanPropertyRowMapper<Employee>(Employee.class), id).get(0);
  }

  @Override
  public Employee findByName(String name) {
    return jt.query("select employee_id,first_name,salary from employees where first_name=?",
        new BeanPropertyRowMapper<Employee>(Employee.class), name).get(0);
  }

  @Override
  public void update(Employee emp) {
    jt.update("update employees set employee_id=?,first_name=?,salary=?", emp.getEmployee_id(), emp.getFirst_name(),
        emp.getSalary());
  }

  public void setJt(JdbcTemplate jt) {
    this.jt = jt;
  }

}
