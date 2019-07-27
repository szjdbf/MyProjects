package com.zlf.proxy.cglib;

public class App {
    public static void main(String[] args) {
        //创建目标对象
        UserDao userDao = new UserDao();
        //通过目标对象创建代理对象
        UserDao proxy = (UserDao) new ProxyFactory(userDao).getProxyInstance();
        proxy.save();


        System.out.println(proxy);
    }
}
