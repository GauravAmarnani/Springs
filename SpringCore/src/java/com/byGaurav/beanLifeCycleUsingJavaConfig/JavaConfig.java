package com.byGaurav.beanLifeCycleUsingJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Utility utilityBean() {
        return new Utility();
    }
}
