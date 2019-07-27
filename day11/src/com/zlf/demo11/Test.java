package com.zlf.demo11;

public class Test {
    public static void main(String[] args) {
        Box b = new Box();

        Thread t1 = new Thread(new Producer(b));
        Thread t2 = new Thread(new Customer(b));

        t1.start();
        t2.start();

    }
}
