package com.zlf.demo05;

/**
 * 接口中可以定义默认方法，不强制要求实现类重写该方法
 * 若子类实现默认方法，则需要将default去掉
 * <p>
 * 接口中的静态方法只能由接口调用，不能用实现类的对象调用
 */
public interface Inter {
    void m1();

    void m2();

    void m3();

    default void m4() {

    }

    static void m5() {

    }

    //JDK9中才有
//    private static void m6(){
//
//    }

}
