package com.example.condition.config;

import com.example.condition.domain.Job;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobConfig {
    @Bean
    @ConditionalOnProperty()
    public Job job() {
        return new Job();
    }
}
