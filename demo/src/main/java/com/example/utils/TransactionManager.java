package com.example.utils;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {
  @Autowired
  private ConnectionUtils connectionUtils;

  public void begin() {
    try {
      connectionUtils.getThreadConnection().setAutoCommit(false);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void commit() {
    try {
      connectionUtils.getThreadConnection().commit();
      ;
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void rollback() {
    try {
      connectionUtils.getThreadConnection().rollback();
      ;
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void release() {
    try {
      connectionUtils.getThreadConnection().close();
      ;
      connectionUtils.removeConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
