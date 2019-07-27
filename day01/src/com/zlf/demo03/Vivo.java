package com.zlf.demo03;

/**
 * Override：方法重写：在子父类关系中，方法和参数要一致
 * 子类不能重写父类的私有方法
 * 子类的权限不能小于父类的权限
 * <p>
 * Overload：方法重载：在同类中，方法参数列表不同，方法名相同，与方法返回值无关
 */
public class Vivo extends Phone {


    @Override
    public void call(String i) {
        System.out.println("开机");
        super.call(i);
    }
}
