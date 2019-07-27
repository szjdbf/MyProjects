package com.zlf.demo02;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * 定义Student类，有姓名和年龄两个属性。
 * 创建4个对象保存到TreeSet集合中。
 * 要求：
 * 按照学生的年龄从大到小排序
 * 如何年龄相同，按照姓名的长度从长到短排序
 * 如果姓名长度也相同，则先存的元素在前，
 * 如果姓名内容和年龄都相同，则不存储。
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>((s1, s2) -> {


            if (s1.getName().equals(s2.getName()) && s1.getAge() == s2.getAge()) {
                return 0;
            }
            int num = s2.getAge() - s1.getAge();
            int num2 = (num == 0) ? s2.getName().length() - s1.getName().length() : num;
            int num3 = num2 == 0 ? 1 : num2;
            return num3;


        });


        set.add(new Student("张三", 23));
        set.add(new Student("李四", 24));
        set.add(new Student("王五", 25));
        set.add(new Student("赵六", 23));
        set.add(new Student("张三丰", 23));
        set.add(new Student("张三", 23));

        for (Student student : set) {
            System.out.println(student.getName() + "|" + student.getAge());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
