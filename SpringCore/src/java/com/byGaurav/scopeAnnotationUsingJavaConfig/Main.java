package com.byGaurav.scopeAnnotationUsingJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        WithScope withScope = context.getBean("withScopeBean" , WithScope.class);
        WithoutScope withoutScope = context.getBean("withoutScopeBean" , WithoutScope.class);
        withScope.displayInfo();
        withoutScope.displayInfo();
        WithScope w = new WithScope();
        w.displayInfo();
    }
}
