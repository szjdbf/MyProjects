package com.zlf.work;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();

        Thread t1 = new Thread(new Person1(w), "张无忌");
        Thread t2 = new Thread(new Person2(w), "周芷若");
        Thread t3 = new Thread(new Person3(w), "赵敏");

        t1.start();
        t2.start();
        t3.start();
    }
}
