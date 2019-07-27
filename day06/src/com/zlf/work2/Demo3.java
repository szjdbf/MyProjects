package com.zlf.work2;

import java.util.Arrays;
import java.util.Random;

/**
 * 41、使用int数组存储10个不重复的随机数（范围1-20，包含1，包含20）。
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(20) + 1;
            if (!contains(arr, num)) {
                arr[i] = num;
            } else {
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //判断num是否在数组中存在
    public static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
