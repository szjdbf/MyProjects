package com.zlf.demo05;

public class Test {
    public static void main(String[] args) {
        Inter i1 = new InterImpl1();
        i1.m1();
        i1.m2();
        i1.m3();


        Inter i2 = new InterImpl2();
        i2.m1();
        i2.m2();
        i2.m3();
        i2.m4();
    }
}
