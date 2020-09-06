package com.byGaurav.propertyFromXml;

import static java.lang.System.out;

public class Fresher {

    private Fresher() {}

    private String name;
    private int score;
    private String strength;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public void displayFresherInfo() {
        out.println("Fresher Info :" + "\nName : " + name  + "\nScore : " + score + "\nStrength : " + strength);
    }
}
