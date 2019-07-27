package com.zlf.demo04;


/**
 * 当参数由多个类型时，可变参数要放在最后面
 * 底层其实是一个数组
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {};
        args(a);

        System.out.println(a);
    }

    public static void args(int... a) {
        System.out.println(a.getClass());
    }
}
