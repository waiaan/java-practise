package com.example.domain;

import java.io.Serializable;

public class Employee implements Serializable {
  private Integer employee_id;
  private String first_name;
  private Double salary;

  public Integer getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", salary=" + salary + "]\n";
  }

}
