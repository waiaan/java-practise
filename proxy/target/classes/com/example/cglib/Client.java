package com.example.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Client {
  public static void main(String[] args) {
    Enhancer.create(Producer.class, new MethodInterceptor() {

      @Override
      public Object intercept(Object proxy, Method method, Object[] args, MethodProxy proxyMethod) throws Throwable {
        float money = (float) args[0];
        return method.invoke(proxy, args);
      }

    });
  }
}
