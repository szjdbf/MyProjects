package com.zlf.work5;

public class Dog extends Animal implements Swimming {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨式有用");
    }
}
