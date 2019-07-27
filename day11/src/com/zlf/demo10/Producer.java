package com.zlf.demo10;

/**
 * 生产者
 */
public class Producer implements Runnable {
    private Box b;
    private int num;


    public Producer(Box b) {
        this.b = b;
    }


    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            synchronized (b) {
                if (!b.state) {
                    b.put(i);
                    b.state = true;
                    b.notify();
                } else {
                    i--;
                    try {
                        b.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}