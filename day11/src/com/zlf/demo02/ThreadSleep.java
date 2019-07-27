package com.zlf.demo02;

/**
 * Thread.sleep(1000);//使当前线程休眠指定的毫秒
 */
public class ThreadSleep extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
