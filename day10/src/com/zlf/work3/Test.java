package com.zlf.work3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 试用版软件
 */
public class Test {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(System.currentTimeMillis());
        File f = new File("day10\\time.properties");

        Properties p = new Properties();
        p.load(new FileReader(f));

        long time = Long.parseLong(p.getProperty("time"));
        while (true) {
            Thread.sleep(1000);
            long now = System.currentTimeMillis();
            if (now <= time) {
                System.out.println("你已经玩过游戏啦,还剩余" + ((time - now) / 1000) + "秒");
            } else {
                System.out.println("你的试用时间已到期");
            }
        }
    }
}
