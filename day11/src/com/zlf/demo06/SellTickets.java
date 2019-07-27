package com.zlf.demo06;

/**
 * 当处于多线程环境，并且出现共享资源，多条执行语句时可能会出现问题
 * <p>
 * <p>
 * 同步代码块
 * symchronized(锁对象){同步代码}
 * <p>
 * 锁对象可以是自定义的任意对象，但必须是同一个对象，一般为this
 * <p>
 * 同步成员方法：加上synchronized关键字，锁对象是this
 * <p>
 * 同步静态方法:同上，锁对象是类.class
 */
public class SellTickets implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}
