package com.byGaurav.autowireProperty;

import static java.lang.System.out;

public class Body2 {
    private Heart heart;
    private Brain brain;

    public void setBrain(Brain brain){
        this.brain = brain;
    }

    public void setHeart(Heart heart){
        this.heart = heart;
    }

    public void startFunctioning(){
        out.println("Body 2 : ");
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
