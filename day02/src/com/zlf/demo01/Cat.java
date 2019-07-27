package com.zlf.demo01;

public class Cat extends Animal {

    public String name = "猫";

    @Override
    public void run() {
        System.out.println("猫在跑");
    }

    public void show(){
        System.out.println("猫独有的方法");
    }
}
