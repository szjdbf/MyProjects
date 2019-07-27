package com.zlf.demo03;

/**
 *public final void join();//等待该线程死亡，当该线程死亡后，其他的才能开始执行
 */
public class ThreadJoin extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "--->" + i);
        }
    }
}
