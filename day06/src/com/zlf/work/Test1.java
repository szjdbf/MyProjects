package com.zlf.work;

import java.util.TreeSet;

/**
 * 第一题：
 * 定义Student类，有姓名和年龄两个属性。
 * 创建4个对象保存到TreeSet集合中。
 * 要求：
 * 按照学生的年龄从大到小排序
 * 如何年龄相同，按照姓名的长度从长到短排序
 * 如果姓名长度也相同，则先存的元素在前，
 * 如果姓名内容和年龄都相同，则不存储。
 */
public class Test1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("张杰", 18));
        ts.add(new Student("谢娜", 17));
        ts.add(new Student("薛宝钗", 17));
        ts.add(new Student("林黛玉", 19));
        ts.add(new Student("孙悟空", 19));
        ts.add(new Student("张杰", 18));
        for (Student s : ts) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        int num = s.age - this.age;
        if (num == 0) {
            num = s.name.length() - this.name.length();
            if (num == 0) {
                if (s.name.equals(this.name)) {
                    return 0;
                }
                return 1;
            }
            return num;
        }
        return num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
