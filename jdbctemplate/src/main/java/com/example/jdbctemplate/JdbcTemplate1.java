package com.example.jdbctemplate;

import com.example.dao.EmployeeDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplate1 {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    EmployeeDao ed = ac.getBean("employeeDao", EmployeeDao.class);
    System.out.println(ed.findById(311));
  }
}