package com.zlf.work2;

public class Worker {

    private int time = 1;

    public synchronized void work1() {
        if (time == 1) {
            System.out.println(Thread.currentThread().getName() + "在练功");
            time = 2;
            notifyAll();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void work2() {
        if (time == 2) {
            System.out.println(Thread.currentThread().getName() + "在练功");
            time = 3;
            notifyAll();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void work3() {
        if (time == 3) {
            System.out.println(Thread.currentThread().getName() + "在练功");
            time = 1;
            notifyAll();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
