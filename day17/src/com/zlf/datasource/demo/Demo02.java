package com.zlf.datasource.demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        p.load(new FileReader("day17\\src\\druid.properties"));
        System.out.println(p);
        Demo02 d=new Demo02();
        System.out.println(d);
        System.out.println(d.hashCode());
        System.out.println(Integer.toHexString(d.hashCode()));

    }
}
