package com.zlf.work2;

import java.util.ArrayList;

/**
 * 44、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，
 * 如果s没出现过返回-1。
 */
public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(17);
        al.add(10);
        al.add(20);
        al.add(25);

        int index = listTest(al, 10);
        System.out.println(index);
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (s.equals(al.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
