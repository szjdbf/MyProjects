package com.zlf.demo02;

public class Demo {
    public static void main(String[] args) {
        look(s -> {
            System.out.println("你");
            System.out.println(s);
        });
    }

    public static void look(Look l) {
       l.look("看啥呢");
    }
}
