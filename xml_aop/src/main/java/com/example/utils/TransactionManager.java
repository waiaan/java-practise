package com.example.utils;

import java.sql.SQLException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManager {
  @Autowired
  private ConnectionUtils connectionUtils;

  @Pointcut("execution(* com.example.service.impl.*.* (..))")
  private void pt() {
  }

  public void begin() {
    System.out.println("tx begin");
    try {
      connectionUtils.getThreadConnection().setAutoCommit(false);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void commit() {
    System.out.println("tx commit");
    try {
      connectionUtils.getThreadConnection().commit();
      ;
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void rollback() {
    System.out.println("tx rollback");
    try {
      connectionUtils.getThreadConnection().rollback();
      ;
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void release() {
    System.out.println("tx release");
    try {
      connectionUtils.getThreadConnection().close();
      ;
      connectionUtils.removeConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Around("pt()")
  public Object aroundAdvice(ProceedingJoinPoint pjp) {
    Object result = null;
    Object[] args = pjp.getArgs();
    try {
      this.begin();
      result = pjp.proceed(args);
      this.commit();
    } catch (Throwable e) {
      this.rollback();
      e.printStackTrace();
      throw new RuntimeException(e);
    } finally {
      this.release();
    }
    return result;
  }
}
