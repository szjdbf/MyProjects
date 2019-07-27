package com.zlf.demo02;

import java.util.ArrayList;

/**
 * 泛型：参数化类型，提供了编译时类型安全检测机制
 * <p>
 * 泛型类
 * 泛型接口
 * 泛型方法
 */
public class FanXing<T> {
    public static void main(String[] args) {
        test(new ArrayList<Person>());
        test(new ArrayList<Teacher>());
        test(new ArrayList<String>());

        test2(new ArrayList<Person>());
        test2(new ArrayList<Teacher>());
        //test2(new ArrayList<String>());报错

        test3(new ArrayList<Person>());
        test3(new ArrayList<Teacher>());
        //test3(new ArrayList<String>());报错

    }

    //匹配任意类型
    public static void test(ArrayList<?> a) {
        System.out.println("匹配任意类型");
    }

    //泛型上限，指定类型的父类
    public static void test2(ArrayList<? extends Person> a) {

    }

    //泛型下限，指定类型的子类
    public static void test3(ArrayList<? super Teacher> a) {

    }

    void save(T t) {

    }
}

class Person {

}

class Teacher extends Person {

}