package com.zlf.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        boolean b = checkString("Hello", (s) -> s.length() > 5);
        System.out.println(b);
        //将姓名长度大于二，年龄小于30的放入集合中
        String[] arr = {"赵敏,20", "周芷若,25", "张无忌,22", "张三丰,100", "郭靖,40"};
        List<String> list = myList(arr, (s) -> s.split(",")[0].length() > 2, (s) -> Integer.parseInt(s.split(",")[1]) < 30);
        System.out.println(list);
    }

    public static boolean checkString(String s, Predicate<String> p) {
//        return p.test(s);
        return p.negate().test(s);

    }

    public static ArrayList<String> myList(String[] arr, Predicate<String> p1, Predicate<String> p2) {
        ArrayList<String> a = new ArrayList<>();
        for (String s : arr) {
            if (p1.and(p2).test(s)) {
                a.add(s);
            }
        }
        return a;
    }
}
