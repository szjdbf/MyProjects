package com.zlf.anno2;

public class Calc {

    @Check
    public void add() {
        int a = 1;
        int b = 2;
        int c=50/0;
        System.out.println(a + "+" + b + "=" + (a + b));

    }

    @Check
    public void mul() {
        int a = 1;
        int b = 2;
        System.out.println(a + "-" + b + "=" + (a - b));
    }

    @Check
    public void cheng() {
        int a = 2;
        int b = 2;
        System.out.println(a + "*" + b + "=" + (a * b));
    }
}
