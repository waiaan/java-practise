package com.example.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConnectionUtils {

  private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

  @Autowired
  private DataSource dataSource;

  public Connection getThreadConnection() {
    Connection connect = tl.get();
    if (connect == null) {
      try {
        connect = dataSource.getConnection();
        tl.set(connect);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return connect;
  }

  public void removeConnection() {
    tl.remove();
  }
}
