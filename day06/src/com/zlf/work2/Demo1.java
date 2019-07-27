package com.zlf.work2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 39、使用Set集合存储10个不重复的随机数（范围1-20，包含1，包含20）。
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建Set集合对象
        Set<Integer> s = new HashSet<>();
        //创建随机数对象
        Random r = new Random();
        //循环，将生成的随机数放到Set集合中
        while (s.size() != 10) {
            s.add(r.nextInt(20) + 1);
        }
        System.out.println(s);
    }
}
