package com.byGaurav.singleton;

public class Utility1 {

    private SourceCode sourceCode;

    public void setSourceCode(SourceCode sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void displayUtility() {
        sourceCode.getData();
    }
}
