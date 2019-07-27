package com.zlf.suanfa;

public class Solution {
    /**
     * 将字符串中的每一个空格替换为%20
     *
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer(" asdasdsa asd sadasd sad sad as")));
        System.out.println("%20");

        System.out.println(Fibonacci(5));
    }

    /**
     * 斐波那契额数列
     *
     * @param n
     * @return
     */
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个
     * n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     *
     * @param target
     * @return
     */
    public static int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     */
    public static double Power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent > 0 ? result : 1 / result;
    }

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和
     * 偶数之间的相对位置不变。
     *
     *   2,14,3,145,1,5,2,4,3
     *
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {//奇数

            }
        }
    }
}