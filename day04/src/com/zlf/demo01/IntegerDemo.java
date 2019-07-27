package com.zlf.demo01;

/**
 * 自动装箱默认调用的是该方法Integer.valueOf(int i);
 * public static Integer valueOf(int i):返回表示指定的 int 值的 Integer   实例
 * public static Integer valueOf(String s):返回一个保存指定值的 Integer 对象 String
 * <p>
 * 自动拆箱默认调用的是该方法i.intValue();
 */
public class IntegerDemo {

    public static void main(String[] args) {
        // public static Integer valueOf(int i)
        Integer i = Integer.valueOf(100);
        System.out.println(i);
        // public static Integer valueOf(String s)
        Integer ii = Integer.valueOf("-0123456");
        // Integer ii = Integer.valueOf("你好Hello"); // NumberFormatException
        System.out.println(ii);

        //int转字符串9
        int i3 = 8888;
        //String s1=i3+"";
        String s2 = String.valueOf(i3);


        //字符串转int
        String s3 = "41345";
        int i4 = Integer.parseInt(s3);
//        Integer i8 = Integer.valueOf(s3);
//        int i5 = i.intValue();

    }
}
