package com.example.cglib;

public class Producer {
  public void sale(float money) {
    System.out.println("sale for " + money);
  }

  public void afterService(float money) {
    System.out.println("after service " + money);
  }
}
