package com.zlf.demo01;

/**
 * 装箱：把基本数据类型转换为包装类
 * 拆箱：把包装类转换为基本数据类型
 * <p>
 * 自动装箱:底层调用的是Integer.valueOf()方法
 * 自动拆箱:底层调用的是obj.intValue()方法
 */
public class BoxDemo {
    public static void main(String[] args) {
        Integer i = 500;//自动装箱
        int i2 = i;//自动拆箱
    }
}
