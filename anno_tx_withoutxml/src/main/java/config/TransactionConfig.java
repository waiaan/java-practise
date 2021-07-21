package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

public class TransactionConfig {

    @Bean
    public PlatformTransactionManager createTransactionManager(DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }
}
