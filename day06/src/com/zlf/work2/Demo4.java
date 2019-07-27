package com.zlf.work2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 42、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个ArrayList集合中，并打印到控制台。
 */
public class Demo4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i >= 10) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
