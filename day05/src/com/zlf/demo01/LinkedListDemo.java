package com.zlf.demo01;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("张杰");
        linked.add("谢娜");
        linked.add("胡歌");
        linked.add("唐嫣");
        System.out.println(linked);
        //默认删除的是第一个
        String s = linked.remove();
        System.out.println(s);
    }
}
