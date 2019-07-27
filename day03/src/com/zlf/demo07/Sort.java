package com.zlf.demo07;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {64, 465, 321, 654, 51, 604, 9814, 81, 654, 654, 416};
        System.out.println("排序前--->" + Arrays.toString(arr));
        buddleSort(arr);
        System.out.println("排序后--->" + Arrays.toString(arr));
        System.out.println(arrayToString(arr));
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void buddleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    /**
     * 模拟Arrays.toString()
     *
     * @param arr
     * @return
     */
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + " ,");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
