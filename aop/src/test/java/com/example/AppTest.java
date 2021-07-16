package com.example;

import com.example.service.EmployeeService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeService es = (EmployeeService) ac.getBean("employeeService");
        es.delete(100);
        es.save();
        es.update(10);
    }
}
