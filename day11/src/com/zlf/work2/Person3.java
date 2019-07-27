package com.zlf.work2;

public class Person3 implements Runnable {
    private Worker w;

    public Person3(Worker w) {
        this.w = w;
    }

    @Override
    public void run() {
        while (true) {
            w.work3();
        }
    }
}
