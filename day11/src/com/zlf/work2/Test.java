package com.zlf.work2;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();

        Thread t1 = new Thread(new Person1(w), "张三");
        Thread t2 = new Thread(new Person2(w), "李四");
        Thread t3 = new Thread(new Person3(w), "王五");

        t1.start();
        t2.start();
        t3.start();
    }
}
