package com.byGaurav.valueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("valueAnnotation.xml");
        Fresher fresher = context.getBean("fresher" , Fresher.class);
        fresher.displayInfo();
    }
}
