package com.zlf.work;

public class Person3 implements Runnable {

    private Worker w;

    public Person3(Worker w) {
        this.w = w;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (w) {
                if (w.time == 3) {
                    w.work3();
                    w.time = 1;
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
