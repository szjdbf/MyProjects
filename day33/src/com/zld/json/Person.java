package com.zld.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Person {

    @JsonIgnore//忽略
    private String name;
    private int age;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//日期格式化
    private Date bitrh;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBitrh() {
        return bitrh;
    }

    public void setBitrh(Date bitrh) {
        this.bitrh = bitrh;
    }


    public Person(String name, int age, String sex, Date bitrh) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.bitrh = bitrh;
    }


    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", bitrh=" + bitrh +
                '}';
    }
}
