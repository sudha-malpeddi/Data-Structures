package com.home.practice.package1;

public class Parent {

    static protected int protectedMember = 12;
    int defaultMember = 8;
    public Parent(int a, int b ){
        this();
        System.out.println("In public Constructor");
    }
    public Parent(){
        new Parent(2, 3);
    }

    public void go(){
        System.out.println("In Parent :: go method");
    }

    static public void func(){
        System.out.println("In Parent static func method");
    }
}
