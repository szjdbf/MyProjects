package com.zlf.demo05;

/**
 * 实现Runnable接口可以让多个线程共享一个资源
 * <p>
 * 线程的状态：   新建   就绪   运行   阻塞    死亡
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
