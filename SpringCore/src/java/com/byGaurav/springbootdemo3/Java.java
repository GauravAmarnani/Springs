package com.byGaurav.springbootdemo3;

import static java.lang.System.out;

public class Java {

    public int javaExam() {
        int result = 80; // Actual Result.
        result = cheatTest(); // Called internally by Gaurav to cheat without Teacher's knowledge.
        out.println("Successful Java Exam.");
        return result;
    }

    public int cheatTest(){
        return 95;
    }
}
