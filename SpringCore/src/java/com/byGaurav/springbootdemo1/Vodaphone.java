package com.byGaurav.springbootdemo1;

import static java.lang.System.out;

public class Vodaphone implements Sim
{
    public void calling()
    {
        out.println("Calling using Vodaphone Sim.");
    }
    public void data()
    {
        out.println("Browsing using Vodaphone Sim.");
    }
}
