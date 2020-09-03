package com.byGaurav.springbootdemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("testbeans.xml");
        Student gaurav = context.getBean("gaurav" , Student.class);
        gaurav.displayResult();
    }
}
