package com.zlf.demo01;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>();无序的
        //有序的
        Set<Integer> s = new TreeSet<>();
        Random r = new Random();
        while (s.size() != 10) {
            s.add(r.nextInt(20) + 1);
        }
        System.out.println(s);
    }
}
