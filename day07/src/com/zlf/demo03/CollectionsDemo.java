package com.zlf.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("孙悟空", 1000));
        list.add(new Student("猪八戒", 800));
        list.add(new Student("玉皇大帝", 10000000));

        Collections.sort(list, Comparator.comparingInt(Student::getAge));
        System.out.println(list);
    }
}
