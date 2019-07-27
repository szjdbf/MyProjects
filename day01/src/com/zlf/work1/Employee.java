package com.zlf.work1;

/**
 * 继承有什么特点？
 * 当几个类具有相同的属性或方法时，可以将共同的特性抽取出来放到一个类中，这个类就是父类，其他的类可以继承该类拥有父类的属性和方法。
 * <p>
 * 继承的优点和缺点有什么？
 * 优点：提高了代码的复用性，提高了代码的维护性
 * 缺点：类与类之间的紧密型加强，耦合性加强
 * <p>
 * 继承中父类和子类的成员之间有什么关系?
 * 子类继承父类，拥有父类非私有的属性和方法，当初始化子类时，会先调用父类的无参构造初始化父类。
 * <p>
 * 重载和重写的区别是什么?
 * 重载（Overload）：在同个类中，方法名相同，方法的参数列表不同，与方法的返回值无关。
 * 重写（Override）：在子类与父类的关系中，子类的方法声明和父类一致，子类重写父类的方法。
 * <p>
 * 提示:（去代码中找到总结的注释.抄写一遍不要复制.（边写边理解））
 * <p>
 * 分析以下需求，并用代码实现
 * (1)项目经理类
 * a.属性：姓名 工号 工资 奖金//bonus
 * b.行为：工作work
 * (2)程序员类
 * a.属性：姓名 工号 工资
 * b.行为：工作work
 * (3)要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
 * 编写测试类:完成这两个类的测试
 */
public class Employee {
    private String name;
    private int number;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int number, int salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public  void work() {
        System.out.println("我在工作。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
