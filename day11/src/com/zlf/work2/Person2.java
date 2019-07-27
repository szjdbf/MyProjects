package com.zlf.work2;

public class Person2 implements Runnable {
    private Worker w;

    public Person2(Worker w) {
        this.w = w;
    }

    @Override
    public void run() {
        while (true) {
            w.work2();
        }
    }
}
