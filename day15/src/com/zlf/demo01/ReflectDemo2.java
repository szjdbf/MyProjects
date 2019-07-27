package com.zlf.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//通过反射读取配置文件运行方法
public class ReflectDemo2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties p = new Properties();
        //加载配置文件
        p.load(new FileInputStream("day15\\obj.properties"));
        //通过反射获取class字节码对象和method
        Class<?> clazz = Class.forName(p.getProperty("class"));
        //创建实例
        Object obj = clazz.getConstructor().newInstance();
        Method m = clazz.getMethod(p.getProperty("method"));
        //执行方法
        m.invoke(obj);
    }
}

class C1 {

    public C1(){

    }
    public void show() {
        System.out.println("哈哈哈");
    }
}

class C2 {
    public C2(){

    }
    public void show2() {
        System.out.println("呵呵呵");
    }
}