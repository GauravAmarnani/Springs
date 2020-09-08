package com.byGaurav.primaryAnnotation;

import org.springframework.stereotype.Component;
import static java.lang.System.out;

@Component
public class ScienceTeacher implements Teacher{
    public void teach() {
        out.println("This is your Math Teacher.");
    }
}
