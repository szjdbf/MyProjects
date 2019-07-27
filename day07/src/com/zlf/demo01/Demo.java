package com.zlf.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

    /**
     * List:存取有序，有索引，允许元素重复
     * ArrayList：数组：查询快，增删慢
     * LinkedList：链表：查询慢，增删快
     * <p>
     * Set：存取无序，无索引，元素唯一
     * HashSet：哈希表（数组+链表）
     * LinkedHashSet：哈希表+链表：有序
     * TreeSet：内部会自动排序（自然排序Comparable<>或者排序器Comparator<>）
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("张无忌", "赵敏");
        map.put("宋青书", "周芷若");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        Set<String> keys = map.keySet();
        for (String k : keys) {
            String v = map.get(k);
            System.out.println(k + "=>" + v);
        }
        System.out.println("---------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> m : entries) {
            System.out.println(m.getKey() + "->" + m.getValue());
        }
//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()) {
//            String k = it.next();
//            String v = map.get(k);
//            System.out.println(k + "=>" + v);
//        }
    }
}
