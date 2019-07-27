package com.zlf.work1;

public class Programmer extends Employee {

    public Programmer() {
    }

    public Programmer(String name, int number, int salary) {
        super(name, number, salary);
    }

    @Override
    public void work() {
        System.out.print(super.getName());
        System.out.println("程序员在工作。。。");
    }
}
