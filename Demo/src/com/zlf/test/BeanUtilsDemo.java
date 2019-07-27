package com.zlf.test;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtilsDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Map<String, String> maps = new HashMap<>();
        String key = "id";
        String value = "10";
        maps.put(key, value);
        Student s = new Student();
        BeanUtils.populate(s, maps);
        System.out.println(s);//0
    }
}
