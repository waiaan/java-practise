package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
  public static void main(String[] args) {
    Producer producer = new Producer();
    producer.sale(10000);

    IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
        producer.getClass().getInterfaces(), new InvocationHandler() {

          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            float money = (float) args[0] + 1000;
            return method.invoke(producer, money);
          }

        });
    proxyProducer.afterService(0);
  }
}
