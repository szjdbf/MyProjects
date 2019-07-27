package com.zlf.demo01;

import java.util.*;

/**
 * Set集合
 * 不能存储重复元素
 * 没有索引，不能使用普通for遍历
 * <p>
 * HashSet：底层数据结构是哈希表(元素为Node的数组)
 * 对集合的迭代顺序不能保证
 * <p>
 * hash不同，元素不同
 * hash相同，元素不一定
 * <p>
 * //先用hash()方法求出存储元素的hash值
 * //如果hash值不同，则不是同一元素，存储
 * //如果hash值相同，则先比较是否为一个地址，然后使用equals方法判断内容是否相同
 * //内容相同，就不存储，内容不同，就存储
 * //if(p.hash==hash&&((k=p.key)==key||(key!=null&&key.equals(k))))
 */
public class SetDemo {
    public static void main(String[] args) {
        //LinkedHashSet：存取有序
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        set.add("c");
        System.out.println(set);
        System.out.println("---------------");

        Set<Student> students = new HashSet<>();
        students.add(new Student("张杰", 30));
        students.add(new Student("胡歌", 32));
        students.add(new Student("张杰", 30));
        students.add(new Student("谢娜", 30));

        System.out.println(students);
    }
}

class Student {
    String name;
    int age;


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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
