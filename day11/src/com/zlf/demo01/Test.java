package com.zlf.demo01;

/**
 * Thread.currentThread();//当前正在执行的线程对象
 */
public class Test {
    public static void main(String[] args) {
        MyThread m = new MyThread("我的线程");
        m.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}