package com.zlf.work1;

public class Demo {


    public static void main(String[] args) {
        //创建经理对象，调用work方法
        Manager e = new Manager("张三", 000001, 10000, 5000);
        e.work();

        //创建程序员对象，调用work方法
        Programmer p = new Programmer("李四", 654465, 5000);
        p.work();


    }

}
