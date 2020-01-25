package com.home.practice.package1;

public interface ABC {
    static int number = 1;

    public static void main(String args[]){
        System.out.println("In interface");
    }

    default void someMethod(){
        System.out.println("In interface :: someMethod()");
    }

    public void someImplMethod();

}
