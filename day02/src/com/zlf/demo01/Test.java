package com.zlf.demo01;

public class Test {

    public static void main(String[] args) {
        Animal cat = new Cat();//使用多态的方式，相当于向上转型
        Animal dog = new Dog();
        Animal panda = new Panda();

        useAnimal(cat);
        useAnimal(dog);
        useAnimal(panda);

        System.out.println();
    }

    public static void useAnimal(Animal a) {//将子类对象传入到方法体中，实际执行的是子类的方法
        if (a instanceof Cat) {//判断该对象是否是该类型
            ((Cat) a).show();//向下转型
        }
        a.run();
    }
}
