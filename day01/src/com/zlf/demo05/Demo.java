package com.zlf.demo05;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        Teacher t = new Teacher("胡歌", 33);
        System.out.println(t);
        t.teach();

        System.out.println("-------------");

        Student s = new Student("张杰", 32);
        System.out.println(s);
        s.study();

        System.out.println(new Date());

    }

}
