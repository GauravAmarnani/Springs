package com.byGaurav.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import static java.lang.System.out;

public class Developer1 {

    private Code code;

    public Developer1() {}

    @Autowired
    public Developer1(Code code){
        out.println("Developer 1 from Constructor : ");
        this.code = code;
    }

    public void startDeveloping(){
        code.startCoding();
    }
}