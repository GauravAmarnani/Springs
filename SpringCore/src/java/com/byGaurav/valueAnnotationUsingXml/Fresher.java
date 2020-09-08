package com.byGaurav.valueAnnotationUsingXml;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import static java.lang.System.out;

public class Fresher {

    private Fresher() {}

    private String name;

    @Value("${fresher.name}")
    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Value("${fresher.score}")
    private int score;

    @Value("${fresher.strength}")
    private String strength;


    public void displayInfo() {
        out.println("Fresher Info : " + "\nName : " + name + "\nScore : " + score + "\nStrength : " + strength);
    }
}
