package com.threads.threaddemo;

import com.threads.threaddemo.Task;

public class ThreadDemo {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Inside main method ...");
    }
}
