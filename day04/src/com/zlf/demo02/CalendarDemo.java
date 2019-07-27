package com.zlf.demo02;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 日历类：简化了获取年月日的步骤
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //抽象类，直接通过静态方法获取该类的子类对象
        Calendar c = Calendar.getInstance();
        //通过日历类获取年月日
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        //Calendar.DATE;

        //设置具体字段的偏移量
        //可以设置20年前的50天前
        c.add(Calendar.YEAR, -21);
        c.add(Calendar.DATE, -127);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        //设置年月日
        c.set(Calendar.YEAR, 2050);
        c.set(Calendar.MONTH, 10);
        c.set(Calendar.DATE, 15);
        System.out.println(c.getTime());


        //获取某一年的2月有多少天
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        cal.set(year, 2, 1);
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.get(Calendar.DATE));
        sc.close();
    }
}
