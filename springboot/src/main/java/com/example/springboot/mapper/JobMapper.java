package com.example.springboot.mapper;

import java.util.List;

import com.example.springboot.domain.Job;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface JobMapper {

    @Select("select job_id jobId,job_title jobTitle,min_salary minSalary from jobs")
    public List<Job> findAll();

    @Select("select job_id jobId,job_title jobTitle,min_salary minSalary from jobs where job_id=#{id}")
    public Job findOne(String id);
}