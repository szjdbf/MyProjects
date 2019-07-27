package com.zlf.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class UserDaoTest {
    public static void main(String[] args) {
        //目标对象
        UserDao userDao = new UserDao();

        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(userDao.getClass());
        //设置回调函数
        enhancer.setCallback((MethodInterceptor) (o, method, arg, methodProxy) -> {
            System.out.println("前置增强");
            Object obj = method.invoke(userDao, arg);
            System.out.println("后置增强");
            return obj;
        });

        //创建代理对象
        UserDao proxy = (UserDao) enhancer.create();

        proxy.save();//执行代理对象方法
    }
}
