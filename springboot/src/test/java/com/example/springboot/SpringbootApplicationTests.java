package com.example.springboot;

import java.util.List;

import com.example.springboot.domain.Job;
import com.example.springboot.mapper.JobMapper;
import com.example.springboot.mapper.JobXMLMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private JobMapper jobMapper;
    @Autowired
    private JobXMLMapper jobXMLMapper;

    @Test
    void contextLoads() {
        System.out.println("------\n");
        // List<Job> jobs = jobXMLMapper.findAll();
        // for (Job job : jobs) {
        // System.out.println(job);
        // }
        Job job = jobMapper.findOne("FI_ACCOUNT");
        System.out.println(job);
        System.out.println("\n------");
    }

}
