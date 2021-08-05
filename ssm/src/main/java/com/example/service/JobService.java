package com.example.service;

import java.util.List;

import com.example.domain.Job;

public interface JobService {

    public List<Job> findAll();

    public void save(Job job);
}
