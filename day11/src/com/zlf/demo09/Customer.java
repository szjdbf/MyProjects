package com.zlf.demo09;

/**
 * 消费者
 */
public class Customer implements Runnable {

    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (b) {
                if (b.state) {
                    b.get();
                    b.state = false;
                    b.notify();
                } else {
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
