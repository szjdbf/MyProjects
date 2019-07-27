package com.zlf.demo01;

import java.util.List;
import java.util.ArrayList;

/**
 * 集合中存放的是对象的引用
 */
public class ArrayListDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("张杰", 20);
        Student s2 = s1;
        list.add(s1);
        list.add(s2);
        System.out.println(list);
        String name = s1.name;
        name="asdsa";
        System.out.println(list);


        Class cls = System.class;
        System.out.println(cls);
    }
}

class Student {
    final String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
