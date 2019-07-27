package com.zlf.work2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 试用版软件
 */
public class Test {

    public static void main(String[] args) throws IOException {
        File f = new File("day10\\game.properties");

        Properties p = new Properties();
        p.load(new FileReader(f));

        int times = Integer.parseInt(p.getProperty("times"));
        if (times > 0) {
            System.out.println("你已经玩过游戏啦,还有" + (--times) + "次机会");
            p.setProperty("times", times + "");
            p.store(new FileWriter(f), "游戏次数");
        } else {
            System.out.println("你的试用次数已到期");
        }
    }
}
