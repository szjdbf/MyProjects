package com.zlf.demo02;

public class Test {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
