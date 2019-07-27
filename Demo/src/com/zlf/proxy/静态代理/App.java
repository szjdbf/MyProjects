package com.zlf.proxy.静态代理;

/**
 * 测试类
 */
public class App {
    public static void main(String[] args) {
        //创建目标对象
        UserDaoImpl target = new UserDaoImpl();
        //创建代理对象,将目标对象作为参数传递到构造方法,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        //执行代理对象的方法
        proxy.save();
    }
}
