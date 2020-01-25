package com.threads.threaddemo.racecondition;

public class BankAccount implements Runnable {
    private int balance;

    @Override
    public void run() {
        makeWithdrawal(75);
        if(balance < 0)
            System.out.println("Money overdrawn");
        readBalance(this);
    }

    synchronized void makeWithdrawal(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " is about to withdraw "+ amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn "+amount);
        }else
            System.out.println(Thread.currentThread().getName() +"...Sorry insufficient money in an account");
    }

    public void readBalance(Object ths){
        System.out.println(Thread.currentThread().getName() + " Current balance is :: " + balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
