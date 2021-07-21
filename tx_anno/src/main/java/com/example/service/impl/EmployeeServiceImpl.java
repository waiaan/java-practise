package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void transfer(String from, String to, float amount) {
        System.out.println("转账开始");
        Employee out = employeeDao.findByName(from);
        Employee in = employeeDao.findByName(to);
        float restSalary = out.getSalary() - amount;
        if (restSalary < 0) {
            throw new RuntimeException(from + " has no enough salary");
        } else {
            out.setSalary(restSalary);
            in.setSalary(in.getSalary() + amount);
            employeeDao.update(in);
            // int i = 1 / 0;
            employeeDao.update(out);
            System.out.println("success");
        }
    }
}
