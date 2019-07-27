package com.zlf.demo02;

public class Test {

    public static void main(String[] args) {
        //使用多态的方式实例化
        Animal a = new Dog();
        //调用子类的方法
        a.eat();
        //调用抽象类中的非抽象方法
        a.sleep();


        Cat c = new WhiteCat();
        c.eat();

        Cat c2 = new BlackWhite();
        c2.eat();
    }
}
