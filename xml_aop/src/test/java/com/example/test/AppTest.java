package com.example.test;

import java.util.List;

import com.example.domain.Employee;
import com.example.service.EmployeeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.strategy.PlatformDescription;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AppTest {

  @Autowired
  private EmployeeService es;

  @Test
  public void findAll() {
    List<Employee> emps = es.findAll();
    System.out.println(es);
    System.out.println(emps);
  }

  @Test
  public void findOneById() {
    Employee emp = es.findOneById(111);
    System.out.println(emp);
  }

  @Test
  public void transfer() {
    es.transfer("Spring MVC", "Spring Boot", 100.00);
  }

}
