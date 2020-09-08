package com.byGaurav.scopeAnnotationUsingXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scopeAnnotationUsingXml.xml");
        WithScope withScope = context.getBean("withScope" , WithScope.class);
        WithoutScope withoutScope = context.getBean("withoutScope" , WithoutScope.class);
        withScope.displayInfo();
        withoutScope.displayInfo();
        WithScope w = new WithScope();
        w.displayInfo();
    }
}
