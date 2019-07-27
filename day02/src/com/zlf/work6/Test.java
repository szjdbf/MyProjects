package com.zlf.work6;

/**
 * 6.老司机开车案例.
 * 1.定义一个汽车类Car.有一个抽象方法run().
 * 2.定义一个小客车BabyCar类继承Car类;
 * 3.定义一个公交车类Bus继承Car类
 * 4.在测试类中定义一个方法.//把Xxx修改成具体类型.
 * public static void dirverCar(Xxx x){
 * x.run();
 * }
 * 调用dirverCar方法.要求任何一种类型的车都可以开起来.
 */
public class Test {
    public static void main(String[] args) {
        Car c = new BabyCar();
        Car c2 = new Bus();

        driverCar(c);
        driverCar(c2);
    }

    public static void driverCar(Car c) {
        c.run();
    }
}
