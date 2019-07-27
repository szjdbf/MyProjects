package com.zlf.work1;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void cashMouse(){
        System.out.println("猫捉老鼠");
    }
}
