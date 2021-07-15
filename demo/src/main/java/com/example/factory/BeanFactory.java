package com.example.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.example.service.EmployeeService;
import com.example.utils.TransactionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanFactory {
  @Autowired
  private EmployeeService employeeService;
  @Autowired
  private TransactionManager txManager;

  @Bean("proxyEmployeeService")
  public EmployeeService getEmployeeService() {
    EmployeeService proxyEmployeeService = (EmployeeService) Proxy.newProxyInstance(
        employeeService.getClass().getClassLoader(), employeeService.getClass().getInterfaces(),
        new InvocationHandler() {

          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
              System.out.println("transfer begin");
              txManager.begin();
              Object result = method.invoke(employeeService, args);
              txManager.commit();
              System.out.println("transfer success");
              return result;
            } catch (Exception e) {
              System.out.println("transfer failed");
              txManager.rollback();
              throw new RuntimeException(e);
            } finally {
              txManager.release();
            }
          }

        });
    return proxyEmployeeService;
  }

}
