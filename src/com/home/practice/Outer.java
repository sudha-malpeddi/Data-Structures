package com.home.practice;

public class Outer
{
    public int a[];
    public void someOuterMethod()
    {
        new Inner();
    }
    public class Inner { }

    public static void main(String[] argv)
    {
        String a;
        Outer ot = new Outer();
        //new Inner();
    }
}
