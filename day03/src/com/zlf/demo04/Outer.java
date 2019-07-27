package com.zlf.demo04;

/**
 * 内部类：在类中定义了一个类
 * 可以解决类单一继承的局限性
 * <p>
 * 成员内部类:在类中定义了一个类，内部类可以直接访问外部类的方法，但是外部类只能通过new内部类访问内部类的成员
 * 创建对象：Outer.Inner oi=new Outer().new Inner();
 * 第二种:Outer o=new Outer(); Outer.Inner oi=o.new Inner();
 * <p>
 * 局部内部类:在外部类的方法内定义一个类,外界无法直接使用,
 * 只能在方法的内部创建内部类的对象调用方法使用，内部类可以直接访问外部类的属性
 *
 * <p>
 * 匿名内部类:
 */
public class Outer {


    //成员内部类
    public class Inner {
        //可以在外面创建内部类的对象，然后调方法
        void show() {
            System.out.println("name");
        }
    }

    //局部内部类(局限性过大)
    public void show2() {
        class Inner2 {
            public void method() {
                System.out.println("成员内部类的方法被调用");
            }

        }
        //只能在方法的内部创建内部类的对象，然后调用该方法
        Inner2 i2 = new Inner2();
        i2.method();
    }

    public void show() {
        Inner i = new Inner();
        i.show();
    }

}
