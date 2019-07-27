package com.zlf.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 1.代理对象,不需要实现接口
 * 2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
 * 3.动态代理也叫做:JDK代理,接口代理
 */
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDaoImpl target = new UserDaoImpl();
        //创建动态代理对象
        /**
         * ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
         * Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
         * InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
         */
        IUserDao o = (IUserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(proxy);
                System.out.println("开始事务");
                Object o = method.invoke(target, args);//当方法的返回值为void时,返回为null
                System.out.println("结束事务");
                return o;
            }
        });
        //通过代理对象执行方法
        o.save();
    }
}
