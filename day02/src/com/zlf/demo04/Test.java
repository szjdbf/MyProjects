package com.zlf.demo04;

public class Test {
    public static void main(String[] args) {
        Animal a = new YellowDog();
        a.eat();
        a.sleep();
        System.out.println(a.age);
        System.out.println(Animal.age);
    }
}
