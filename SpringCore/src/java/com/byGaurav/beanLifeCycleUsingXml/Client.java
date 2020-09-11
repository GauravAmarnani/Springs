package com.byGaurav.beanLifeCycleUsingXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static java.lang.System.out;

public class Client {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    @PostConstruct
    public void init() {
        out.println("Initialized.");
    }

    @PreDestroy
    public void destroy() {
        out.println("Destroyed.");
    }

    public void displayInfo() {
        out.println("Name : " + name + ".");
        out.println("ID : " + id + ".");
    }
}