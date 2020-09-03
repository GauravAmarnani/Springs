package com.byGaurav.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import static java.lang.System.out;

public class Developer2 {

    private Code code;

    @Autowired
    public void setCode(Code code){
        out.println("Developer 2 from byType : ");
        this.code = code;
    }

    public void startDeveloping(){
        code.startCoding();
    }
}