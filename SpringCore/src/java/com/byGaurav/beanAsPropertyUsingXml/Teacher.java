package com.byGaurav.beanAsPropertyUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAsPropertyUsingXml.xml");
        Student gaurav = context.getBean("gaurav" , Student.class);
        gaurav.displayResult();
    }
}
