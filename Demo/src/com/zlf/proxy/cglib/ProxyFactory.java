package com.zlf.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib代理工厂
 * <p>
 * <p>
 * <p>
 * SpringAOP:如果目标类实现接口,则使用JDK代理,没有实现接口,使用Cglib代理
 */
public class ProxyFactory implements MethodInterceptor {
    //维护目标对象
    private Object target;

    public ProxyFactory(Object obj) {
        this.target = obj;
    }

    //给目标对象创建代理对象
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象(代理对象)
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("111");
        Object a = method.invoke(target, args);//执行目标方法
        System.out.println("222");
        return a;
    }
}
