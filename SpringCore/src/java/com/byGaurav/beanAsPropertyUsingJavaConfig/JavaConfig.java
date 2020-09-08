package com.byGaurav.beanAsPropertyUsingJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Teacher mathTeacherBean() {
        Teacher teacher = new MathTeacher();
        return teacher;
    }

    @Bean
    public Principal principalBean() {
        Principal principal = new Principal();
        return principal;
    }

    @Bean
    public College collegeBean() {
        College college = new College(mathTeacherBean());
        college.setPrincipal(principalBean());
        return college;
    }
}
