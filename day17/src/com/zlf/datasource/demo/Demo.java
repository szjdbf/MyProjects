package com.zlf.datasource.demo;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet<>(Comparator.comparingInt(String::length));

        list.add("asdsad");
        list.add("61984984asd");
        list.add("ybddfdff");
        list.add("greb");
        list.add("x");


        System.out.println(list);
    }

}
