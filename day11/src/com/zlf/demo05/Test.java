package com.zlf.demo05;

public class Test {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();

        //多个线程共享同一个对象
        //将实现类作为Thread的构造方法的参数传递进去
        Thread t1 = new Thread(m, "飞机");
        Thread t2 = new Thread(m, "轮船");

        t1.start();
        t2.start();
    }
}
