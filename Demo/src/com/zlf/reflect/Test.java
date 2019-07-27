package com.zlf.reflect;

import sun.misc.VM;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {


    public static void main(String[] args) throws Exception {
        //获取Person字节码对象
        Class<?> clazz = Class.forName("com.zlf.reflect.Person");
        //获取该类的所有public方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //获取该类的所有字段//包括私有
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //获取该类的所有构造方法
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //获取该类的所有接口
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
//        获取实例对象
        Object o = clazz.newInstance();
        //获取包括私有构造方法
        Constructor<?> c = clazz.getDeclaredConstructor(Integer.class, String.class, Double.class);
        c.setAccessible(true);//暴力反射
        Object o2 = c.newInstance(1001, "张杰", 100.0);
        System.out.println(o2);


        String s = VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        System.out.println(s);
    }
}
