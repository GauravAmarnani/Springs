package com.byGaurav.scopeAnnotationUsingJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:scopeAnnotation.properties")
public class JavaConfig {

    @Bean
    public WithScope withScopeBean() {
        return new WithScope();
    }

    @Bean
    public WithoutScope withoutScopeBean() {
        return new WithoutScope();
    }
}
