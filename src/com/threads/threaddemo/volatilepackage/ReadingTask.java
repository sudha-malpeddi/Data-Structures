package com.threads.threaddemo.volatilepackage;

public class ReadingTask implements Runnable {
    @Override
    public void run() {
        Data data = new Data();
        System.out.println(Thread.currentThread().getName() + " "+ data.getX());
    }
}
