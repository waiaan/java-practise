package com.example.springboot.mapper;

import java.util.List;

import com.example.springboot.domain.Job;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobXMLMapper {

    public List<Job> findAll();
}