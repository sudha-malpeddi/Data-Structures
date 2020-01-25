package com.threads.threaddemo.racecondition;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class RaceCondition {
    public static void main(String[] args) {
        BankAccount task = new BankAccount();
        task.setBalance(100);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("John");
        t2.setName("Anita");

        t1.start();
        t2.start();

        System.out.println("In main thread...");
    }
}
