package com.zlf.demo01;

/**
 * 继承的好处：1.提高了代码的复用性 2.提高了代码的维护性
 * 继承的弊端：继承让类与类产生了关系，类的耦合性增强了，削弱了子类的独立性
 * <p>
 * 开发原则：高内聚，低耦合
 *
 * 继承中变量的访问特点：
 *      访问原则：就近原则
 */
public class Zi extends Fu {
    private String name = "zlf";

    @Override
    public void method() {
        System.out.println("这是子类的方法");
    }


    public void showName() {
        String name = "szj";
        //访问局部变量
        System.out.println(name);
        //访问成员变量
        System.out.println(this.name);
        //访问父类成员变量
        System.out.println(super.name);
        //调用父类的方法
        super.method();
    }
}
