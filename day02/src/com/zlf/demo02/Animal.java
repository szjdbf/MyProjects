package com.zlf.demo02;

/**
 * 抽象类：一个方法若被声明为抽象方法，则必须需要将该类设置为抽象类
 * <p>
 * 抽象类中不一定有抽象方法，抽象方法中的类一定是抽象类
 * <p>
 * 抽象类的子类：
 * 要么重写抽象类的所有抽象方法，要么子类也是抽象类
 */
public abstract class Animal {

    public abstract void eat();

    public void sleep() {
        System.out.println("睡觉");
    }
}
