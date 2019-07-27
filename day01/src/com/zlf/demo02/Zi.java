package com.zlf.demo02;

public class Zi extends Fu {

    public Zi() {
        //显式调用父类有参构造
        super(15);
        System.out.println("子类的无参构造执行了");
    }

    public Zi(int age) {
        //显式调用父类有参构造
        super(15);
        System.out.println("子类的有参构造执行了");
    }

}