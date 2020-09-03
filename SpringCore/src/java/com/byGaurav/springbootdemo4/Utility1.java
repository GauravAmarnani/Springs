package com.byGaurav.springbootdemo4;

public class Utility1 {

    private SourceCode sourceCode;

    public void setSourceCode(SourceCode sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void displayUtility() {
        sourceCode.getData();
    }
}
