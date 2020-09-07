package com.byGaurav.componentAnnotationUsingXml;

import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
public class Test {

    private Test() {}

    public void testing() {
        out.println("Testing successful");
    }
}
