package com.threads.threaddemo.volatilepackage;

public class Data {
    private static volatile int x = 10;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = ++x;
    }
}
