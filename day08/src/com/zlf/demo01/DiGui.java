package com.zlf.demo01;

/**
 * 递归：自己调用自己，要有一个出口
 */
public class DiGui {
    public static void main(String[] args) {
        System.out.println(method(20));
    }

    public static int method(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return method(n - 1) + method(n - 2);
    }
}
