package com.home.practice.package1;

public interface XYZ {
    default void someMethod1(){
        System.out.println("In interface :: someMethod()");
    }

    public static void main(String[] args) {
        System.out.println("In interface XYZ");
    }
}
