package com.byGaurav.beanLifeCycleUsingXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String...args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleUsingXml.xml");
        Client client = context.getBean("client" , Client.class);
        client.displayInfo();
        context.registerShutdownHook();
    }
}