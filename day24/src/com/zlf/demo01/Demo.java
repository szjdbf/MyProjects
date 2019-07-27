package com.zlf.demo01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //获取XML路径
        String path = Demo.class.getClassLoader().getResource("users.xml").getPath();
        //创建Document对象
        Document d = Jsoup.parse(new File(path), "utf-8");
        //根据元素名称获取元素对象集合
        Elements elements = d.getElementsByTag("age");
        Element element = elements.get(0);
        //获取标签内容
        String s = element.text();
        System.out.println(s);

        //根据属性获取元素对象集合
        Elements es = d.getElementsByAttribute("id");
        System.out.println(es);

        //根据属性和属性值获取元素对象集合
        Elements es2 = d.getElementsByAttributeValue("id", "111");
        System.out.println(es2);

        System.out.println("----------------");
        //使用css选择器来选择元素，和css语法一样
        Elements e = d.select("#111");
        System.out.println(e);
        Elements e2 = d.select(".nnn");
        System.out.println(e2);
    }
}
