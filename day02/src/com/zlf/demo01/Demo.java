package com.zlf.demo01;

public class Demo {

    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal a = new Cat();
        System.out.println(a.name);//动物
        a.run();//猫在跑
    }



}
