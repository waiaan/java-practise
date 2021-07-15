package com.example.proxy;

public class Producer implements IProducer {
  public void sale(float money) {
    System.out.println("sale for " + money);
  }

  public void afterService(float money) {
    System.out.println("after service " + money);
  }
}
