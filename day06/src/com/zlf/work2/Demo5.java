package com.zlf.work2;

import java.util.ArrayList;
import java.util.List;

/**
 * 43、定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
 * （1）遍历集合遍历输出。
 * （2）求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
public class Demo5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张无忌", 20, "男"));
        list.add(new Student("郭靖", 35, "男"));
        list.add(new Student("赵敏", 19, "女"));
        list.add(new Student("小龙女", 45, "女"));
        //遍历集合遍历输出
        for (Student s : list) {
            System.out.println(s);
        }
        //求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        int index = 0;//默认年龄最大的索引为0
        int maxAge = list.get(0).age;//默认年龄最大
        for (int i = 1; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.age > maxAge) {
                maxAge = s.age;
                index = i;
            }
        }
        Student s = list.get(index);
        s.name = "小猪佩奇";
        System.out.println(list);
    }
}

class Student {
    String name;
    int age;
    String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
