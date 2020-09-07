package com.byGaurav.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Test test = context.getBean("testBean" , Test.class);
        test.testing();
    }
}
