package com.zlf.demo03;

public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + super.getName() + ", age=" + super.getAge() + '}';
    }
}
