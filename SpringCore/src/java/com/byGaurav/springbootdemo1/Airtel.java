package com.byGaurav.springbootdemo1;

import static java.lang.System.out;

public class Airtel implements Sim
{
    public void calling()
    {
        out.println("Calling using Airtel Sim.");
    }
    public void data()
    {
        out.println("Browsing using Airtel Sim.");
    }
}
