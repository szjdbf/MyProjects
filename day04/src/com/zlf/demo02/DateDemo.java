package com.zlf.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期类
 */
public class DateDemo {
    public static void main(String[] args) throws Exception {
        //当前系统时间
        Date d = new Date();
        System.out.println(d);

        //将毫秒值转换为Date()对象
        Date d2 = new Date(1000L * 60 * 60 * 24 * 365);//传入一年
        System.out.println(d2);

        //获取当前对象的毫秒值
        Date d3 = new Date();
        System.out.println(d3.getTime());

        //设置当前对象的毫秒值
        Date d4 = new Date();
        d4.setTime(5611616);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化日期对象(将日期转换为字符串)
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(date));

        //解析字符串(将字符串转换为日期)
        String str = "2018-04-11 12:15:14";
        Date strDate = sdf.parse(str);
        System.out.println(strDate);

        //将日期转换为指定的字符串格式
        String s1 = formatDate(new Date());
        System.out.println(s1);
        //将字符串转换为日期
        Date d5 = parseString("2019-04-21 14:42:49");
        System.out.println(d5);
    }

    private static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    private static Date parseString(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(str);
    }
}
