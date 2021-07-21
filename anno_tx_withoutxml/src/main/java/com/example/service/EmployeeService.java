package com.example.service;

import com.example.domain.Employee;

public interface EmployeeService {
    Employee findById(int id);

    void transfer(String from, String to, float money);
}
