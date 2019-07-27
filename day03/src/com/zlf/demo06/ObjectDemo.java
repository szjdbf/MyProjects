package com.zlf.demo06;

import java.util.Objects;

public class ObjectDemo {
    public static void main(String[] args) {
        //Object的toString()方法;打印对象的字符串表达形式
        Person p = new Person("张三", 50);
        Person p2 = new Person("张三", 50);
        //Object的equals()方法，建议所有的类重写该方法,可以比较两个对象的实际内容是否相等
        System.out.println(p.equals(p2));
    }
}

class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
