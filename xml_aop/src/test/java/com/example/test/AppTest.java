package com.example.test;

import java.util.List;

import com.example.domain.Employee;
import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Unit test for simple App.
 */
@ContextConfiguration(locations = "classpath:bean.xml")
public class AppTest {

  @Autowired
  private EmployeeService es;

  @Test
  public void findAll() {
    // ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    // EmployeeService es = ac.getBean("employeeServiceImpl",
    // EmployeeServiceImpl.class);
    System.out.println(es);
    List<Employee> emps = es.findAll();
    System.out.println(emps);
  }

  @Test
  public void findOneById() {
    Employee emp = es.findOneById(107);
    System.out.println(emp);
  }

  @Test
  public void transfer() {
    es.transfer("Spring MVC", "Spring Boot", 100.00);
  }

}
