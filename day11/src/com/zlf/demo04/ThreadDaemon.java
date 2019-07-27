package com.zlf.demo04;

/**
 *  public final void setDaemon(boolean on) ;//将该线程设置为守护线程，当只剩下守护线程时，JVM停止运行
 */
public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + "--->" + i);
        }
    }
}
