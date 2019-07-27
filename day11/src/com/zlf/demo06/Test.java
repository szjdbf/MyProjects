package com.zlf.demo06;

public class Test {
    public static void main(String[] args) {
        SellTickets s = new SellTickets();

        Thread t1 = new Thread(s, "窗口A");
        Thread t2 = new Thread(s, "窗口B");
        Thread t3 = new Thread(s, "窗口C");

        t1.start();
        t2.start();
        t3.start();
    }
}
