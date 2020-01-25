package com.home.practice.package1;

public class FirstChild extends Parent{
    public FirstChild(){
        //super(2, 3);
        System.out.println("In FirstChild Constructor");
    }

    public void go(){
        System.out.println("In FirstChild :: go method" + protectedMember);
    }

    static public void func(){
        System.out.println("In FirstChild static func method");
    }
}
