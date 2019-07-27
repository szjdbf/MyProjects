package com.zlf.demo01;


import java.util.HashMap;
import java.util.Map;

/**
 * Map集合特点：键值对，无索引，键不重复，存取无序
 */
public class MapDemo {
    //遍历集合
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("张无忌", "周芷若");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");

        //根据键删除键值对
        map.remove("张无忌");

        //是否包括键
        boolean b1 = map.containsKey("郭靖");
        System.out.println(b1);

        //是否包括值
        boolean b2=map.containsValue("马荣");

        //集合的长度
        System.out.println(map.size());

        //清空集合
        //map.clear();

        //集合是否为空
        System.out.println(map.isEmpty());

        System.out.println(map);
    }

}
