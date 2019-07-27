package com.zlf.demo07;

public class Test {
    public static void main(String[] args) {
        use(String::substring);
    }

    public static void use(MyInter m) {
        String s = m.print("Hello,world", 2, 5);
        System.out.println(s);
    }
}
