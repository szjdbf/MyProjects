package com.zlf.demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<>();
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("名字" + (i + 1));
            String name = sc.nextLine();
            System.out.println("语文" + (i + 1));
            int chinese = sc.nextInt();
            System.out.println("数学" + (i + 1));
            int math = sc.nextInt();
            System.out.println("英语" + (i + 1));
            int english = sc.nextInt();
            ts.add(new Student(name, chinese, math, english));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\ts.txt"));
        for (Student t : ts) {
            bw.write(t.getName() + "," + t.getChinese() + "," + t.getMath() + "," + t.getEnglish() + "," + t.getSum());
            bw.newLine();
        }
        bw.close();
    }
}


class Student implements Comparable<Student> {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return chinese + math + english;
    }

    @Override
    public int compareTo(Student o) {
        int num = o.getSum() - this.getSum();
        num = num == 0 ? this.getChinese() - o.getChinese() : num;
        num = num == 0 ? this.getMath() - o.getMath() : num;
        num = num == 0 ? this.getName().compareTo(o.getName()) : num;
        return num;
    }
}
