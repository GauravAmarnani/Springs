package com.byGaurav.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Test testBean() {
        Test test = new Test();
        return test;
    }
}
