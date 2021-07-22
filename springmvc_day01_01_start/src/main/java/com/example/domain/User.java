package com.example.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class User implements Serializable {
    private String name;
    private String password;
    private Double salary;
    private List<Account> list;
    private Map<String, Account> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Account> getList() {
        return list;
    }

    public void setList(List<Account> list) {
        this.list = list;
    }

    public Map<String, Account> getMap() {
        return map;
    }

    public void setMap(Map<String, Account> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User [list=" + list + ", map=" + map + ", name=" + name + ", password=" + password + ", salary="
                + salary + "]";
    }

}
