package com.zlf.demo01;

import java.io.Serializable;

/**
 * 反射：在运行时去获取一个类的变量和方法信息，通过获取的信息创建对象，调用方法的一种机制
 */
public class ClassLoaderDemo {
    public static void main(String[] args) throws Exception{
        System.out.println(ClassLoader.getSystemClassLoader());//AppClassLoader
        System.out.println(ClassLoader.getSystemClassLoader().getParent());//ExtClassLoader
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());//null
        System.out.println(Serializable.class);
    }
}
