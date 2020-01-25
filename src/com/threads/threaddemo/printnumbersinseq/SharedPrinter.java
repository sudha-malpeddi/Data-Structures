package com.threads.threaddemo.printnumbersinseq;

class SharedPrinter{

    int number = 1;
    int numOfThreads;
    int numInSequence;

    SharedPrinter(int numInSequence, int numOfThreads){
        this.numInSequence = numInSequence;
        this.numOfThreads = numOfThreads;
    }

    public void printNum(int result){
        synchronized(this) {
            while (number < numInSequence - 1) {
                while(number % numOfThreads != result){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + number++);
                this.notifyAll();
            }
        }
    }
}