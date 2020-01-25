package com.threads.threaddemo;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            public void run() {
                while(!stop) { System.out.println(Thread.currentThread().getName()+ " In while ..."); }
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        stop = true;
        System.out.println(Thread.currentThread().getName() );
    }
}
