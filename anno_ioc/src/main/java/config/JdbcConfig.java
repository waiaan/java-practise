package config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class JdbcConfig {

    @Value("${jdbc.driverClass}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;

    @Bean
    @Scope("prototype")
    public QueryRunner creatQueryRunner(@Qualifier("createDataSource") DataSource ds) {
        return new QueryRunner(ds);
    }

    @Bean
    public DataSource createDataSource() {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass(driverClass);
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
        ds.setUser(user);
        ds.setJdbcUrl(url);
        return ds;
    }

}
