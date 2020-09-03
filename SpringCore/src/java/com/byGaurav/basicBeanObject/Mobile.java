package com.byGaurav.basicBeanObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;

public class Mobile
{
    public static void main(String...args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("basicBeanObject.xml");
        out.println("Config loaded.");
        Sim sim = (Sim)context.getBean("jio");
        sim.calling();
        sim.data();
    }
}
