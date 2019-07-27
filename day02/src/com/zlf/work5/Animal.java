package com.zlf.work5;

public abstract class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void water() {
        System.out.println("动物喝水");
    }

    public abstract void eat();
}
