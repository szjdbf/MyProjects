package com.zlf.work2;

public class Person1 implements Runnable {
    private Worker w;

    public Person1(Worker w) {
        this.w = w;
    }

    @Override
    public void run() {
        while (true) {
            w.work1();
        }
    }
}
