package com.example.test;

import java.util.List;

import com.example.domain.Employee;
import com.example.service.EmployeeService;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.SpringConfig;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void findAll() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeService es = ac.getBean("employeeService", EmployeeService.class);
        List<Employee> emps = es.findAll();
        System.out.println(emps);
    }

    @Test
    public void findOneById() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeService es = ac.getBean("employeeService", EmployeeService.class);
        Employee emp = es.findOneById(107);
        System.out.println(emp);
    }

    @Test
    public void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        QueryRunner es = ac.getBean("runner", QueryRunner.class);
        QueryRunner es1 = ac.getBean("runner", QueryRunner.class);
        System.out.println(es == es1);
    }
}
