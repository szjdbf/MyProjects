package com.zlf.demo05;

public class BasketballTeacher extends Teacher  {
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教学");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }
}
