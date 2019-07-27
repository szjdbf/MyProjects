package com.zlf.demo06;

/**
 * public static double abs(double num): 取绝对值
 * public static double ceil(double num): 向上取整
 * public static double floor(double num):向下取整
 * public static long round(double num): 四舍五入
 * public static int max(int a, int b) : 求最大值
 * public static int min(int a, int b) : 求最小值
 * public static double pow(double a, double b):求a的b次幂
 * public static double random()  : 随机的范围[0,1)
 * Math.PI  -> 圆周率
 */
public class MathDemo {

    public static void main(String[] args) {
        System.out.println(Math.abs(-510132.1330435));

        System.out.println(Math.ceil(2.423));

        System.out.println(Math.floor(3.5656));

        System.out.println(Math.round(3.654654));

        System.out.println(Math.pow(2, 15));

        System.out.println(Math.random());//[0.0,1.0)

        System.out.println(Math.PI);

        System.out.println(Math.E);
    }

}
