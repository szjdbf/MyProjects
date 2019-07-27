package com.zlf.demo02;

/**
 * 参数是抽象类，实际需要的是抽象类的子类对象
 * 返回类型是抽象类，实际返回的是抽象类的子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        useAnimal(a);
    }

    public static void useAnimal(Animal a) {
        a.eat();
    }

}
