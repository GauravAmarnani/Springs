package com.byGaurav.componentAnnotationUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentAnnotationUsingXml.xml");
        Test test = context.getBean("test" , Test.class);
        test.testing();
    }
}
