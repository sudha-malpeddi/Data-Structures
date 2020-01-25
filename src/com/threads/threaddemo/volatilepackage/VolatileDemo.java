package com.threads.threaddemo.volatilepackage;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class VolatileDemo {
    public static void main(String[] args) {
        IncreamentTask task = new IncreamentTask();
        ReadingTask readingTask = new ReadingTask();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(readingTask);
        Thread t3 = new Thread(readingTask);

        t1.setName("Increment Thread");
        t2.setName("Reading Thread 1");
        t3.setName("Reading Thread 2");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("In main method...");
    }
}
