package com.zlf.demo04;

public class InnerDemo {

    public static void main(String[] args) {
        //内部类被private修饰时,就不能创建内部类对象
        //Outer.Inner oi=new Outer().new Inner();//报错
        Outer o = new Outer();
        o.show();
    }
}
