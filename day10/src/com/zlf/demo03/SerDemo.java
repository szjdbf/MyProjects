package com.zlf.demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\student.ser"));
        oos.writeObject(new Student("张杰", 35));
        oos.close();

        //对象反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\student.ser"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}

class Student implements Serializable {
    private static final long serialVersionUID = 13456L;//序列化版本号，当加上之后，对类进行修改不影响反序列化

    String name;
    transient int age;//不参与序列化

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
