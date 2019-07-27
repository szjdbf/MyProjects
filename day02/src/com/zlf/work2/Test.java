package com.zlf.work2;

/**
 * 2.
 * 根据需求完成代码:
 * (1)定义一个手机类
 * a.行为:打电话,发短信
 * <p>
 * (2)定义一个接口IPlay
 * a.行为:玩游戏
 * <p>
 * (3)定义一个旧手机类继承手机类
 * a.行为:继承父类的行为
 * <p>
 * (4)定义一个新手机继承手机类实现IPlay接口
 * a.行为:继承父类的行为,重写玩游戏方法
 * <p>
 * (5)定义一个测试类
 * a.在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
 * 在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
 * <p>
 */
public class Test {

    public static void main(String[] args) {
        Phone o = new OldPhone();
        usePhone(o);

        Phone n = new NewPhone();
        usePhone(n);


        System.out.println(n instanceof NewPhone);
        System.out.println(n instanceof IPlay);
    }

    public static void usePhone(Phone p) {
        p.call();
        p.sendMessage();
        if (p instanceof NewPhone) {
            ((NewPhone) p).playGame();
        }
    }

}
