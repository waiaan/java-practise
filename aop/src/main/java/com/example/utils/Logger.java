package com.example.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

  @Pointcut("execution( * com.example.service.impl.*.* (..))")
  private void pt1() {
  }

  // @Before("pt1()")
  // public void printBefore() {
  // System.out.println("before-开始记录日志");
  // }

  // @After("pt1()")
  // public void printAfter() {
  // System.out.println("after-开始记录日志");
  // }

  // @AfterReturning("pt1()")
  // public void printReturn() {
  // System.out.println("afterreturn-开始记录日志");
  // }

  // @AfterThrowing("pt1()")
  // public void printException() {
  // System.out.println("afterthrowing-开始记录日志");
  // }

  @Around("pt1")
  public Object printAround(ProceedingJoinPoint pjp) {
    Object result = null;
    try {
      Object[] args = pjp.getArgs();
      System.out.println("before-开始记录日志");
      result = pjp.proceed(args);
      System.out.println("afterreturn-开始记录日志");
    } catch (Throwable e) {
      System.out.println("afterthrowing-开始记录日志");
      throw new RuntimeException(e);
    } finally {
      System.out.println("after-开始记录日志");
    }
    return result;
  }
}
