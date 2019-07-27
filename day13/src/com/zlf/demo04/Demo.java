package com.zlf.demo04;

public class Demo {
    public static void main(String[] args) {
        Inter i = () -> System.out.println("asd");
        i.a();
    }
}

interface Inter {
    void a();
}
