package com.example;

import com.example.service.EmployeeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AppTest {
    @Autowired
    private EmployeeService es;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void findOne() {
        System.out.println(es.findById(106));
    }

    @Test
    public void transfer() {
        es.transfer("Tomcat", "Maven", 100);
    }
}
