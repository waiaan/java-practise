package com.example.service.impl;

import java.util.Date;

import com.example.dao.EmployeeDao;
import com.example.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
  private String name;
  private Integer age;
  private Date birth;

  public EmployeeServiceImpl(String name, Integer age, Date birth) {
    this.name = name;
    this.age = age;
    this.birth = birth;
  }

  @Override
  public String toString() {
    return "EmployeeServiceImpl [age=" + age + ", birth=" + birth + ", name=" + name + "]";
  }

  @Override
  public void get() {
    // TODO Auto-generated method stub

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

}
