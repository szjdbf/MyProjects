package com.zlf.demo03;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat("加菲猫", 12);
        a.eat();
        System.out.println(a);

        Animal b = new Cat();
        b.setAge(1);
        b.setName("小猫");
        b.eat();
        System.out.println(b);

        for (long i = 0; i < Long.MAX_VALUE; i++) {
            System.out.println(i);
        }
    }
}
