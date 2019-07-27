package com.zlf.demo03;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.sum() - o1.sum();
                if (num == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return 1;
            }
        });
        Student s1 = new Student(99, 99, "周润发");
        Student s2 = new Student(99, 99, "王宝强");
        Student s3 = new Student(19, 22, "李世民");
        Student s4 = new Student(79, 22, "秦晖");
        Student s5 = new Student(99, 99, "周润发");
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student t : ts) {
            System.out.println(t.getName() + "," + t.getSx() + "," + t.getYw() + "," + t.sum());
        }
    }
}

class Student {
    private int yw;
    private int sx;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int sum() {
        return yw + sx;
    }

    public int getYw() {
        return yw;
    }

    public void setYw(int yw) {
        this.yw = yw;
    }

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public Student(int yw, int sx, String name) {
        this.yw = yw;
        this.sx = sx;
        this.name = name;
    }

    public Student() {
    }


}
