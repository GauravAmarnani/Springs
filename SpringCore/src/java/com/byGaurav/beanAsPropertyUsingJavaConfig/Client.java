package com.byGaurav.beanAsPropertyUsingJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        College college = context.getBean("collegeBean" , College.class);
        college.displayInfo();
    }
}
