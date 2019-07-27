package com.zlf.demo01;

import java.util.TreeSet;

/**
 * 元素有序：这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序
 * 没有带索引
 * 元素唯一
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(521);
        ts.add(220);
        ts.add(3122);
        ts.add(2120);
        ts.add(1588);
        System.out.println(ts);

        //往TreeSet中存放的元素必须要实现Comparable接口
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("zhangjie", 30));
        persons.add(new Person("xiena", 30));
        persons.add(new Person("huge", 31));
        persons.add(new Person("tangyan", 29));
        System.out.println(persons);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    @Override
    public int compareTo(Person o) {
        return /*this.age - o.age == 0 ? this.name.compareTo(o.name) : this.age - o.age*/0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
