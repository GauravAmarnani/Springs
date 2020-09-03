package com.byGaurav.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireAnnotation.xml");
        Developer1 developer1 = context.getBean("developer1", Developer1.class);
        developer1.startDeveloping();
        Developer2 developer2 = context.getBean("developer2", Developer2.class);
        developer2.startDeveloping();
        Developer3 developer3 = context.getBean("developer3", Developer3.class);
        developer3.startDeveloping();
    }
}