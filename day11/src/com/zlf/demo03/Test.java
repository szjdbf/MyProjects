package com.zlf.demo03;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("大哥");
        tj2.setName("二弟");
        tj3.setName("三弟");

        tj1.start();
        tj1.join();
        tj2.start();
        tj3.start();

    }
}
