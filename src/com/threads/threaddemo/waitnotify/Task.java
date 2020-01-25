package com.threads.threaddemo.waitnotify;

public class Task implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has entered run method");
        synchronized(this){
            try {
                //Thread.sleep(5000);
                wait(2);
            }catch (InterruptedException e){}
            go();
            System.out.println(Thread.currentThread().getName() + " has exited run method");
            notify();
        }
    }

    public void go(){
        System.out.println(Thread.currentThread().getName() + " has entered go method");
        more();
        System.out.println(Thread.currentThread().getName() + " has exited go method");
    }

    public void more(){
        System.out.println(Thread.currentThread().getName() + " is in more method");
    }
}
