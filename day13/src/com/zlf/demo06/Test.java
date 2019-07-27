package com.zlf.demo06;

public class Test {
    public static void main(String[] args) {
        int s = show(Integer::parseInt);
        System.out.println(s);
    }

    public static int show(Inter i) {
        return i.convert("123456");
    }
}
