package com.byGaurav.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import static java.lang.System.out;

public class Fresher {

    private Fresher() {}

    @Value("${fresher.name}")
    private String name;

    @Value("${fresher.score}")
    private int score;

    @Value("${fresher.strength}")
    private String strength;

    public void displayInfo() {
        out.println("Fresher Info : " + "\nName : " + name + "\nScore : " + score + "\nStrength : " + strength);
    }
}
