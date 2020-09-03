package com.byGaurav.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
    public static void main(String...args){
        ApplicationContext context = new ClassPathXmlApplicationContext("utilitybeans.xml");
        Utility1 utility1 = context.getBean("utility1" , Utility1.class);
        Utility2 utility2 = context.getBean("utility2" , Utility2.class);
        utility1.displayUtility();
        utility2.displayUtility();
    }
}
