package com.zlf.demo02;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListAndHashMap {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> m1 = new HashMap<>();
        m1.put("宋喆", "马蓉");
        m1.put("PGOne", "李小璐");
        m1.put("白百合", "陈羽凡");

        Map<String, String> m2 = new HashMap<>();
        m2.put("张无忌", "赵敏");
        m2.put("杨过", "小龙女");
        m2.put("郭靖", "黄蓉");

        Map<String, String> m3 = new HashMap<>();
        m3.put("孙悟空", "紫霞仙子");
        m3.put("猪八戒", "高老庄媳妇");
        m3.put("唐僧", "女儿国国王");

        list.add(m1);
        list.add(m2);
        list.add(m3);

        //遍历
        for (Map<String, String> map : list) {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.println(key + "->" + map.get(key));
            }
            System.out.println("-----------");
        }

    }
}
