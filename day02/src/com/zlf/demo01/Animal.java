package com.zlf.demo01;

/**
 * 多态：一个对象在不同时刻具有不同的形态
 * <p>
 * 格式：父类引用指向子类对象
 * <p>
 * 运行：成员变量：编译和运行都看左边
 * 成员方法：编译看左边，运行看右边
 * <p>
 * 静态成员和方法：都看左边
 * <p>
 * 多态的好处：提高了代码的扩展性
 * 多态的弊端：不能访问子类独有的方法
 * <p>
 * 多态的转型：向上转型：父类引用指向子类对象，是安全的
 * 向下转型：父类引用转为子类引用，是不安全的，可以使用if(anObject instance 子类)判断
 */
public class Animal {

    public String name = "动物";

    public void run() {
        System.out.println("动物在跑");
    }
}
