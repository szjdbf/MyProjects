package com.zlf.demo04;

/**
 * 接口：规定了一种公共的规范
 * <p>
 * 接口只能有静态常量或抽象方法；//所有的变量都默认使用public static final修饰
 * //所有的方法默认使用public abstract修饰
 * <p>
 * 接口中不能有构造方法
 * <p>
 * 类和接口的关系:类可以多实现接口
 * 接口和接口的关系：接口可以多继承接口
 *
 * 抽象类是对事物的抽象
 * 接口是对行为的抽象
 */
public interface Animal {
    int age = 555;

    void eat();

    void sleep();
}
