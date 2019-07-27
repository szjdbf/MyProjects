package com.zlf.demo05;

public class PingpangPlayer extends Player implements StudyEnglish {
    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
