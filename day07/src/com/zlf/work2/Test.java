package com.zlf.work2;

import java.util.*;

/**
 * 键盘录入多个字符串，直到输入"exit"为止。
 * 统计每个字符串中字符以及字符出现的次数。
 */
public class Test {
    public static void main(String[] args) {
        //定义一个List集合，存储每行的字符和个数
        List<Map<Character, Integer>> strs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            //当输入exit时，结束循环
            if ("exit".equals(str)) break;
            //创建Map集合，存储一行的字符和个数
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            }
            //将每行的信息加入到List集合中
            strs.add(map);
        }
        sc.close();
        //遍历List集合，打印每行的字符和个数.
        for (Map<Character, Integer> str : strs) {
            Set<Character> keys = str.keySet();
            for (Character key : keys) {
                System.out.print((key == ' ' ? "空格" : key )+ "(" + str.get(key) + ")");
            }
            System.out.println();
        }
    }
}
