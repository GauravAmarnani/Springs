package com.byGaurav.beanLifeCycleUsingJavaConfig;

import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import static java.lang.System.out;

public class Utility {

    @Value("Gaurav")
    private String name;

    @Value("1")
    private int id;

    @PostConstruct
    public void init() {
        out.println("Initialized.");
        start();
    }

    public void start() {
        out.println("Name : " + name + ".");
        out.println("ID : " + id + ".");
    }

    @PreDestroy
    public void destroy() {
        out.println("Destroyed.");
    }
}
