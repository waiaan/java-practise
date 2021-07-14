package config;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JdbcConfig {
  @Bean
  @Scope("prototype")
  public QueryRunner runner(DataSource ds) {
    return new QueryRunner(ds);
  }

  @Bean(name = "ds")
  public DataSource dataSource2() {
    ComboPooledDataSource cpds = new ComboPooledDataSource();
    try {
      cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    cpds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
    cpds.setUser("root");
    cpds.setPassword(null);
    return cpds;
  }
}
