package com.zlf.demo05;

public class Test {
    public static void main(String[] args) {
        BasketballPlayer bp = new BasketballPlayer();
        bp.eat();
        bp.study();
        System.out.println("-------------");
        BasketballTeacher bt = new BasketballTeacher();
        bt.eat();
        bt.teach();
        System.out.println("-------------");
        PingpangPlayer pp = new PingpangPlayer();
        pp.eat();
        pp.speak();
        pp.study();
        System.out.println("-------------");
        PingpangTeacher pt = new PingpangTeacher();
        pt.eat();
        pt.speak();
        pt.teach();
    }
}
