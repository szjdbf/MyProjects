package com.zlf.demo01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();

        //获取字节码对象
        Class<? extends List> clazz = list.getClass();
        //获取方法对象
        Method add = clazz.getMethod("add", Object.class);
        //执行方法
        add.invoke(list, "张杰");
        add.invoke(list, "谢娜");
        add.invoke(list, "呵呵");


        System.out.println(list);
    }
}
