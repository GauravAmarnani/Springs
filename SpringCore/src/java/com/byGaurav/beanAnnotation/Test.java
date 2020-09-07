package com.byGaurav.beanAnnotation;

import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
public class Test {
    public void testing() {
        out.println("Testing successful");
    }
}
