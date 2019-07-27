package com.zlf.demo08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 当处于多线程环境，并且出现共享资源，多条执行语句时可能会出现问题
 * <p>
 * JDK5之后新加的功能
 * Lock接口以及ReentrantLock实现类
 * void lock();加锁
 * void unlock();释放锁
 * <p>
 * <p>
 * Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。此实现允许更灵活的结构，
 * 可以具有差别很大的属性，可以支持多个相关的 Condition 对象。
 */
public class SellTickets implements Runnable {
    private int tickets = 100;

    private Lock lock = new ReentrantLock();//使用Lock接口的实现类

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//加锁
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();//释放锁
            }
        }
    }
}
