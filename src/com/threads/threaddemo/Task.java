package com.threads.threaddemo;

public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        System.out.println("Inside run method ...");
        go();
    }

    public void go(){
        System.out.println("Inside go method ...");
        more();
    }

    public void more(){
        System.out.println("Inside more method ...");
    }
}
