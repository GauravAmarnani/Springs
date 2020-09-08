package com.byGaurav.primaryAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Client client = context.getBean("client" , Client.class);
        client.displayInfo();
    }
}
