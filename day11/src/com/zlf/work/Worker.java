package com.zlf.work;

public class Worker {
    int time = 1;

    public void work1() {
        System.out.println(Thread.currentThread().getName() + "在练功");
    }

    public void work2() {
        System.out.println(Thread.currentThread().getName() + "在练功");
    }

    public void work3() {
        System.out.println(Thread.currentThread().getName() + "在练功");
    }
}
