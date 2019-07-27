package com.zlf.work;

import java.util.ArrayList;
import java.util.Random;

/**
 * 第二题：
 * 在一个ArrayList集合中有一些奖项，请随机抽取集合中的奖项。抽完为止。
 * <p>
 * 比如：
 * ArrayList<String> list=new ArrayList<>();
 * list.add("IphoneX");
 * list.add("澳洲六日游");
 * list.add("华为P30");
 * list.add("MLB卫衣");
 * list.add("篮球");
 * list.add("打气筒");
 * <p>
 * 执行结果：
 * (执行结果是随机的)
 * 本次抽出的奖项：篮球
 * 本次抽出的奖项：iphoneX
 * 本次抽出的奖项：华为P30
 * 本次抽出的奖项：打气筒
 * 本次抽出的奖项：澳洲六日游
 * ben'xi：MLB卫衣
 */

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();

        list.add("IphoneX");
        list.add("澳洲六日游");
        list.add("华为P30");
        list.add("MLB卫衣");
        list.add("篮球");
        list.add("打气筒");
        ArrayList<String> list2 = new ArrayList<>();
        while (list2.size() != 6) {
            int index = r.nextInt(list.size());
            System.out.println("本次抽出的奖项:" + list.get(index));
            if (!list2.contains(list.get(index))) {
                list2.add(list.get(index));
            }
        }

    }
}
