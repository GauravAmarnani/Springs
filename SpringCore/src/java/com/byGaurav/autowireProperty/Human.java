package com.byGaurav.autowireProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {
    public static void main(String...agrs){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireProperty.xml");
        Body1 body1 = context.getBean("body1" , Body1.class);
        body1.startFunctioning();
        Body2 body2 = context.getBean("body2" , Body2.class);
        body2.startFunctioning();
        Body3 body3 = context.getBean("body3" , Body3.class);
        body3.startFunctioning();
    }
}
