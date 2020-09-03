package com.byGaurav.sprintbootdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam
{
    public static void main(String...args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentbeans.xml");

        Student gaurav = context.getBean("gaurav" , Student.class);
        gaurav.displayStudentInfo();

        Student vishnu = context.getBean("vishnu" , Student.class);
        vishnu.displayStudentInfo();
    }
}
