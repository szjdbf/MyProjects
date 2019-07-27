package com.zlf.demo05;

import java.util.Arrays;

/**
 * 匿名内部类:是一个继承了该类或者实现了该接口的子类(实现类)匿名对象
 */
public class Demo {
    public static void main(String[] args) {
        //有名字的匿名内部类
        Animal a = new Animal() {
            @Override
            void eat() {
                System.out.println("吃饭");
            }
        };
        method(a);

        //匿名对象+匿名内部类
        method(new Animal() {
            @Override
            void eat() {
                System.out.println("吃饭啦");
            }
        });
    }

    public static void method(Animal a) {
        a.eat();
    }
}
