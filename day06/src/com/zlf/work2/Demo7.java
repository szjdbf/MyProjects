package com.zlf.work2;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 45、已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 46、将该数组里面只出现1次的qq号都存放在LinkedList集合中，将集合中所有元素分别用迭代器和增强for循环打印出来。
 */
public class Demo7 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (!list.contains(s)) {
                list.add(strs[i]);
            }
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-----------");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
