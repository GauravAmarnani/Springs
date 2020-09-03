package com.byGaurav.autowireProperty;

import static java.lang.System.out;

public class Body3 {
    private Heart heart;
    private Brain brain;

    public Body3(Heart heart , Brain brain){
        this.brain = brain;
        this.heart = heart;
    }

    public void startFunctioning(){
        out.println("Body 3 : ");
        if(heart!=null){
            heart.pump();
            if(brain!=null){
                brain.startThinking();
            }
            else{
                out.println("Brain Failure.");
            }
        }
        else{
            out.println("Heart Failure.");
        }
    }
}
