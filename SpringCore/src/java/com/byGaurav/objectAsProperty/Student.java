package com.byGaurav.objectAsProperty;

import static java.lang.System.out;

public class Student {

    private int mathMarks , javaMarks;
    private Math mathTest;
    private Java javaTest;

    public void setMathTest(Math mathTest){
        this.mathTest = mathTest;
    }

    public void setJavaTest(Java javaTest){
        this.javaTest = javaTest;
    }

    public void displayResult() {
        mathMarks = mathTest.mathExam();
        out.println("Math Result : " + mathMarks);
        javaMarks = javaTest.javaExam();
        out.println("Java Result : " + javaMarks);
    }
}
