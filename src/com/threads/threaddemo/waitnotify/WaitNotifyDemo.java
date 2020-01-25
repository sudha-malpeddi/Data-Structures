package com.threads.threaddemo.waitnotify;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Task task = new Task();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("First-thread");
        t2.setName("Second-thread");

        t1.start();
        t2.start();
    }
}
