package com.byGaurav.scopeAnnotationUsingJavaConfig;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
public class WithoutScope {
    private String name;

    @Required
    @Value("${WithoutScope.name}")
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        out.println("Name : " + name);
    }
}
