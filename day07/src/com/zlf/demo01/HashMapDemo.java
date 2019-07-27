package com.zlf.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 输入一个字符串，将每一个字符出现的次数计入到Map集合中
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //若换成TreeMap，则会按照自然排序进行排序
        Map<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串...");
        String line = sc.nextLine();
        sc.close();
        //遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            Integer num = map.get(c);
            map.put(c, num == null ? 1 : ++num);
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> keys = map.keySet();
        for (Character c : keys) {
            int num = map.get(c);
            sb.append(c).append("(").append(num).append(")");
        }
        System.out.println(sb);
    }
}
