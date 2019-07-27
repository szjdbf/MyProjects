package com.zlf.demo01;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] arr = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        operator(arr, (a) -> System.out.println(a), (a) -> System.out.println(a));
    }

    private static void operator(String[] arr, Consumer<String> c1, Consumer<String> c2) {
        for (String s : arr) {
            c1.accept(s.split(",")[0]);
            c2.accept(s.split(",")[1]);
        }
    }
}


