package com.zlf.demo01;

public class Demo {
    public static void main(String[] args) {
        useJumpping(() -> System.out.println("Hello"));
    }

    public static void useJumpping(Jumpping j) {
        j.jump();
    }
}
