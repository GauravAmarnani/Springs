package com.byGaurav.springbootdemo4;

public class Utility2 {

    private SourceCode sourceCode;

    public void setSourceCode(SourceCode sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void displayUtility() {
        sourceCode.getData();
    }
}
