package com.byGaurav.beanLifeCycleUsingJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        context.registerShutdownHook();
        Utility utility = context.getBean("utilityBean", Utility.class);
    }
}
