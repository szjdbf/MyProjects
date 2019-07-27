package com.zlf.demo01;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.zlf.demo01.Student");
        //通过反射实例化对象
        Constructor<?> con = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        //取消访问检查
        con.setAccessible(true);
        Object o = con.newInstance("张杰", 25, "湖南");
        System.out.println(o);

        Class<?> clazz2 = Class.forName("java.lang.System");
        //通过反射实例化对象
        Constructor<?> con2 = clazz2.getDeclaredConstructor();
        con2.setAccessible(true);
        Object o2 = con2.newInstance();
        System.out.println(o2);
    }
}

class Student {

    private String name;
    private int age;
    private String address;

    private Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}