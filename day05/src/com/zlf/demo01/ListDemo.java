package com.zlf.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 增强for循环的底层原理是生成iterator对象,当使用foreach时增加或删除元素会抛出ConcurrentModificationException
 * List:存取有序，有索引，元素可重复
 */
public class ListDemo {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张杰");
        list.add("谢娜");

        list.add("胡歌");
        list.add("唐嫣");
        //内部类的迭代器对象
        //Iterator<String> it = list.iterator();
        //it.next();//ConcurrentModificationException并发修改异常
        //forEach遍历
        for (String s :
                list) {
            System.out.println(s);
            // list.add("asds");//ConcurrentModificationException并发修改异常
        }
        System.out.println("-------------");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------");
        //普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
