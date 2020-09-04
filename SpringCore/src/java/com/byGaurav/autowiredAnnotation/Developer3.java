package com.byGaurav.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static java.lang.System.out;

public class Developer3 {

    @Autowired
    @Qualifier("cody")
    private Code code;

    public void startDeveloping(){
        out.println("Developer 3 from byName : ");
        code.startCoding();
    }
}