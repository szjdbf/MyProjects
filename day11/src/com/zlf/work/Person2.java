package com.zlf.work;

public class Person2 implements Runnable {

    private Worker w;

    public Person2(Worker w) {
        this.w = w;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (w) {
                if (w.time == 2) {
                    w.work2();
                    w.time = 3;
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
