package com.example.dao;

import java.util.List;

import com.example.domain.Job;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface JobDao {

    @Select("select job_id as id,job_title as title,min_salary as minSalary from jobs")
    public List<Job> findAll();

    @Insert("insert into jobs (job_id,job_title,min_salary) values (#{id},#{title},#{minSalary})")
    public void save(Job job);
}
