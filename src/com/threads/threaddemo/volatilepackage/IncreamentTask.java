package com.threads.threaddemo.volatilepackage;

public class IncreamentTask implements Runnable {
    @Override
    public void run() {
        System.out.println("In increment run method");
        Data data = new Data();

        data.setX(11);
        System.out.println(Thread.currentThread().getName() + " is incrementing the value");

    }
}
