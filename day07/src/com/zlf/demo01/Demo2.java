package com.zlf.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("00001", new Student("张杰", 31));
        map.put("00002", new Student("胡歌", 32));
        map.put("00003", new Student("谢娜", 32));
        map.put("00004", new Student("唐嫣", 30));

        //第一种遍历
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "->" + map.get(key));
        }

        System.out.println("----------------------------");

        //第二种遍历
        Set<Map.Entry<String, Student>> entries = map.entrySet();//HashMap$EntrySet
        for (Map.Entry<String, Student> entry : entries) {//HashMap$Node
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }


    }
}

class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
