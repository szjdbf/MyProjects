package com.zlf.demo01;

/**
 * 参数传递：
 * 值传递:当基本数据类型作为参数时，传递的是值
 * 引用传递：引用类型作为参数时，传递的时地址值
 */
public class CatDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        useCat(c);
    }

    public static void useCat(Cat c) {
        c.run();
    }
}
