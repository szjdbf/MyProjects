package com.zlf.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("day09\\src\\japan.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            String[] s = str.split(",");
            list.add(new Student(s[0], s[1], Integer.parseInt(s[2]), s[3]));
        }

        System.out.println(list);
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
