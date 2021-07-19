package com.example.service.impl;

import com.example.service.EmployeeService;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Override
  public void save() {
    int i = 1 / 0;
    System.out.println("执行了保存");
  }

  @Override
  public void update(int id) {
    System.out.println("执行了更新 " + id);
  }

  @Override
  public int delete(int id) {
    System.out.println("执行了删除 " + id);
    return 0;
  }

}
