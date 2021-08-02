package com.example.service.impl;

import java.util.List;

import com.example.domain.Job;
import com.example.service.JobService;

import org.springframework.stereotype.Service;

@Service("JobService")
public class JobServiceImpl implements JobService {

    @Override
    public List<Job> findAll() {
        System.out.println("service findAll");
        return null;
    }

    @Override
    public void save(Job job) {
        System.out.println("service save");
    }

}
