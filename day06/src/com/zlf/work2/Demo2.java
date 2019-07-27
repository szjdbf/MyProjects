package com.zlf.work2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 40、使用ArrayList集合存储10个不重复的随机数（范围1-20，包含1，包含20）。
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        while (list.size() != 10) {
            int num = r.nextInt(20) + 1;
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
