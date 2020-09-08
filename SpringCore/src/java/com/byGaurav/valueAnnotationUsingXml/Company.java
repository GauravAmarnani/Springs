package com.byGaurav.valueAnnotationUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("valueAnnotationUsingXml.xml");
        Fresher fresher = context.getBean("fresher" , Fresher.class);
        fresher.displayInfo();
    }
}
