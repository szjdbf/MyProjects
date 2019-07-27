package com.zlf.demo01;

/**
 * 多线程类：继承Thread，并重写run()方法
 * <p>
 * Thread.currentThread();//当前正在执行的线程对象
 */
public class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "--->" + i);
        }
    }
}
