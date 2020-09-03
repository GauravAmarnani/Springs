package com.byGaurav.objectAsProperty;

import static java.lang.System.out;

public class Math {

    public int mathExam() {
        int result = 70; // Actual Result.
        result = cheatTest(); // Called internally by Gaurav to cheat without Teacher's knowledge.
        out.println("Successful Math Exam.");
        return result;
    }

    public int cheatTest(){
        return 95;
    }
}
