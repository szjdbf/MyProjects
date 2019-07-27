package com.zlf.demo03;

/**
 * try{
 * 可能出现的异常
 * }catch(异常类名 变量名){
 * 异常处理的代码
 * }
 * <p>
 * 程序从try的代码开始执行，当出现异常时，会自动生成一个异常类对象，
 * 该对象将被提交给Java运行时系统，Java运行时系统接收到异常类对象时，
 * 就回到catch中寻找匹配的异常类，然后进行异常的处理，处理完后，程序
 * 可以继续执行
 * <p>
 * <p>
 * e.getMessage();//异常的原因
 * e.toString();//异常的类型和原因
 * e.printStackTrace();//异常的类型原因和位置
 * <p>
 * Java中的异常被分为两大类：编译时异常（受检异常）和运行时异常（非受检异常）
 * 所有的RuntimeException都是运行时异常,其他异常都是编译时异常
 * <p>
 * 编译时异常：必须显式(必须)处理，否则程序就会发生错误，无法编译
 * 运行时异常：无需显式(可以不处理)处理，程序可以通过编译，运行时会出现错误
 * <p>.
 * 当抛出的是运行时异常时，调用该方法的方法可以不进行操作
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {//可能出现问题的代码，如果有问题，则跳入到catch块中
            int a = 1 / 0;
        } catch (Exception e) {
//            System.out.println(e);
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nends");
    }

}
