package com.zlf.demo01;

import java.util.Arrays;

/**
 * 将字符串的数字“91 27 46 38 50”，进行排序
 */
public class StringDemo {
    public static void main(String[] args) {
        //定义字符串
        String str = "91 27 46 38 50";
        //对字符串进行分割,放到String数组
        String[] strArray = str.split(" ");
        //定义int数组
        int[] arr = new int[strArray.length];
        //遍历String数组，将每一个数组中的元素转化为int类型存放到int数组中
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        //对int数组进行排序
        Arrays.sort(arr);
        //打印结果
        System.out.println(Arrays.toString(arr));
        //拼接字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append("->");
            }
        }
        System.out.println(sb);
    }
}
