package com.zlf.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第一题：
 * ArrayList<String> list = new ArrayList<>();
 * list.add("石原里美");
 * list.add("新垣结衣");
 * list.add("新垣结衣");
 * list.add("花泽香菜");
 * list.add("新垣结衣");
 * list.add("桥本环奈");
 * list.add("桥本环奈");
 * 打印集合中的元素，重复元素只打印一次。
 * <p>
 * 第二题：
 * 生成10个 1-100的随机整数保存到集合中。并打印。
 * 要求： 不能出现重复的数字。
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("石原里美");
        list.add("新垣结衣");
        list.add("新垣结衣");
        list.add("花泽香菜");
        list.add("新垣结衣");
        list.add("桥本环奈");
        list.add("桥本环奈");
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (!list2.contains(s)) {
                System.out.println(s);
                list2.add(s);
            }
        }

        //生成10个 1-100的随机整数保存到集合中。并打印。
        //要求： 不能出现重复的数字
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        while (numbers.size() != 100) {
            count++;
            Integer n = (int) (Math.random() * 100) + 1;
            if (!numbers.contains(n)) {
                numbers.add(n);
            }
        }
        System.out.println(numbers);

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers.get(i);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
