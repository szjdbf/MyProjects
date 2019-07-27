package com.zlf.demo07;

/**
 * final修饰的类: 没有子类的 它是太监类没有儿子,可以有父类的
 * final修饰的成员方法: 不能被重写,表示的方法是最终的一个方法
 * final修饰的成员变量: 表示的值是最终的,是一个常量
 * <p>
 * 常量：
 * 字面值常量 : 1 "Hello"
 * 自定义常量: 常量被final所修饰的   public final int VALUE = 10;
 * 自定义静态常量:  public final static int VALUE = 10;
 * <p>
 * final修饰引用数据类型: 修饰的是地址值是不能发生改变的
 * final修饰基本数据类型: 修饰的是具体的值是不能发生改变的
 */
public class Class1 {
    public final int age = 50;

    public static String name = "张三";

    public static void main(String[] args) {
        Class1 c = new Class1();
        /*
        报错，不能对常量进行修改
        c.age=100;
         */
        System.out.println(c.age);

    }

}
