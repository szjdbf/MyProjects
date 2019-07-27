package com.zlf.work;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SDFDemo {

    public static void main(String[] args) throws Exception {
        String birthday = "2019-04-12";
        int day = getDay(birthday);
        System.out.println(day);

        printDate();
    }


    // 请使用日期时间相关的API，计算出一个人已经出生了多少天。

    /**
     * @param birthday 出生年月日xxxx-xx-xx
     * @return 出生的天数
     */
    public static int getDay(String birthday) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //出生时候的毫秒
        long birthTimes = sdf.parse(birthday).getTime();
        //现在的毫秒
        long nowTimes = System.currentTimeMillis();
        //相差的毫秒
        long times = nowTimes - birthTimes;
        //转换为天数
        long day = times / 1000 / 60 / 60 / 24;
        return (int) day;
    }


    /*
        第四题:分析以下需求，并用代码实现
        1.已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象
        2.将(1)中的日期对象转换为日历类的对象
        3.根据日期对象获取改日期是星期几,以及这一年的第几天
        4.通过键盘录入日期字符串，格式(2015-10-20)
        如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"*/
    public static void printDate() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        //获取输入的日期字符串
        String s = sc.next();
        //将字符串转换为日期
        Date d = sdf.parse(s);
        sc.close();
        Calendar cal = Calendar.getInstance();
        //将Date转换为Calendar
        cal.setTime(d);
        sdf = new SimpleDateFormat("yyyy年-MM月-dd日");
        String a = sdf.format(d);
        int b = cal.get(Calendar.YEAR);
        int c = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(a + " " + b + " " + c);
    }
}

