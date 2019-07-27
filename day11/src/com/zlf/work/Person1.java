package com.zlf.work;

public class Person1 implements Runnable {

    private Worker w;

    public Person1(Worker w) {
        this.w = w;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (w) {
                if (w.time == 1) {
                    w.work1();
                    w.time = 2;
                    w.notifyAll();
                } else {
                    try {
                        w.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
