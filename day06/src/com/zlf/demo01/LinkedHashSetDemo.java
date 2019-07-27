package com.zlf.demo01;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet是HashSet的子类
 * <p>
 * 无索引，由链表保证元素有序，由哈希表保证元素唯一
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("c");
        l.add("a");
        l.add("b");
        l.add("d");
        System.out.println(l);
    }
}
