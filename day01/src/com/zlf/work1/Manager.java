package com.zlf.work1;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String name, int number, int salary, int bonus) {
        super(name, number, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.print(super.getName());
        System.out.println("经理在工作。。。");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
