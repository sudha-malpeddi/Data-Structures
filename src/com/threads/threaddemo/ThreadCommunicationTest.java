package com.threads.threaddemo;

class BankClient {
    int balAmount = 5000;
    synchronized void withdrawMoney(int amount) {
        System.out.println("Withdrawing money");
        try {
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        balAmount -= amount;
        System.out.println("The balance amount is: " + balAmount);
    }
    synchronized void depositMoney(int amount) {
        System.out.println("Depositing money");
        balAmount += amount;
        System.out.println("The balance amount is: " + balAmount);
        notify();
    }
}
public class ThreadCommunicationTest {
    public static void main(String args[]) {
        final BankClient client = new BankClient();
        new Thread() {
            public void run() {
                client.withdrawMoney(3000);
            }
        }.start();
        new Thread() {
            public void run() {
                client.depositMoney(2000);
            }
        }.start();
    }
}