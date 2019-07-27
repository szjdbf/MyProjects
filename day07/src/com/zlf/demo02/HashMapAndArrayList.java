package com.zlf.demo02;

import java.util.*;

public class HashMapAndArrayList {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        list1.add("郑州");
        list1.add("许昌");
        list1.add("周口");
        list1.add("洛阳");

        List<String> list2 = new ArrayList<>();
        list2.add("苏州");
        list2.add("无锡");
        list2.add("南京");
        list2.add("徐州");

        List<String> list3 = new ArrayList<>();
        list3.add("福州");
        list3.add("厦门");
        list3.add("东莞");

        map.put("河南", list1);
        map.put("江苏", list2);
        map.put("福建", list3);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "省有以下市:");
            List<String> list = map.get(key);
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}