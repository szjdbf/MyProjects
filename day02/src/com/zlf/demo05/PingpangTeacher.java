package com.zlf.demo05;

public class PingpangTeacher extends Teacher implements StudyEnglish {

    public PingpangTeacher() {
    }

    public PingpangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练在说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教学");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练在吃饭");
    }
}

