package com.byGaurav.autowireProperty;

import static java.lang.System.out;

public class Heart {
    private Heart(){ }

    public void pump(){
        out.println("Heart started Pumping.");
    }
}
