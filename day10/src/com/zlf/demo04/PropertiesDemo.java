package com.zlf.demo04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        store();
        load();
    }

    public static void load() throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("day10\\name.properties"));
        System.out.println(p);
    }

    public static void store() throws IOException {
        Properties p = new Properties();
        p.setProperty("姓名", "张杰");
        p.setProperty("年龄", "35");
        p.setProperty("职业", "歌手");
        p.setProperty("地址", "长沙");
        p.store(new FileWriter("day10\\name.properties"), "张杰的信息");
    }
}
