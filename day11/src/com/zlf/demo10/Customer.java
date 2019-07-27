package com.zlf.demo10;

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
        b.get();
    }
}