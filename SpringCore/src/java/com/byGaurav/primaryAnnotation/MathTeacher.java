package com.byGaurav.primaryAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import static java.lang.System.out;

@Component
@Primary
public class MathTeacher implements Teacher{
    public void teach() {
        out.println("This is your Math Teacher.");
    }
}
