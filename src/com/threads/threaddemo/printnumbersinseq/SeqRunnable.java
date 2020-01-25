package com.threads.threaddemo.printnumbersinseq;

class SeqRunnable implements Runnable{
    SharedPrinter sp;
    int result;
    static Object sharedObj = new Object();

    SeqRunnable(SharedPrinter sp, int result){
        this.sp = sp;
        this.result = result;
    }

    @Override
    public void run() {
        sp.printNum(result);
    }
}