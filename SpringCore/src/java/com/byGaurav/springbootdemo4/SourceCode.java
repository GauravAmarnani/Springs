package com.byGaurav.springbootdemo4;

import static java.lang.System.out;

public class SourceCode {

    private SourceCode() {
        out.println("SourceCode Object created.");
    }

    public void getData(){
        out.println("Data accessed.");
    }
}
