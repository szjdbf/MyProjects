package com.zlf.demo01;

/**
 * 测试类
 */
public class Demo {

    public static void main(String[] args) {
        //创建子类对象
        Zi zi = new Zi();
        //调用子类方法
        zi.method();
        //调用父类方法
        zi.showName();

    }

}
