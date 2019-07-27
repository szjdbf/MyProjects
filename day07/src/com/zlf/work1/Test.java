package com.zlf.work1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 模拟打牌
 */
public class Test {
    public static void main(String[] args) {
        //花色
        String[] color = {"♥", "♠", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //创建集合，将牌放到集合中
        Map<Integer, String> jokers = new HashMap<>();

        for (String c : number) {
            for (String n : color) {
                jokers.put(jokers.size(), n + c);
            }
        }
        jokers.put(jokers.size(), "s🐱");
        jokers.put(jokers.size(), "b🐱");
        //定义Map的索引
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < jokers.size(); i++) {
            index.add(i);
        }
        Collections.shuffle(index);
        //System.out.println(jokers);
        //创建三个集合对象，当作三个人
        Set<Integer> zhangwuji = new TreeSet<>();
        Set<Integer> zhouzhiruo = new TreeSet<>();
        Set<Integer> zhaomin = new TreeSet<>();
        //底牌
        Set<Integer> dipai = new TreeSet<>();

        //遍历牌集合模拟发牌的索引
        for (int i = 0; i < index.size(); i++) {
            if (i < index.size() - 3) {
                int joker = i % 3;
                switch (joker) {
                    case 0:
                        zhangwuji.add(index.get(i));
                        break;
                    case 1:
                        zhouzhiruo.add(index.get(i));
                        break;
                    case 2:
                        zhaomin.add(index.get(i));
                        break;
                }
            } else {
                dipai.add(index.get(i));
            }
        }

//        System.out.println("张无忌的牌--->" + zhangwuji);
//        System.out.println("周芷若的牌--->" + zhouzhiruo);
//        System.out.println("赵敏 的 牌--->" + zhaomin);
//        System.out.println("底牌--->" + dipai);
        lookJoker("张无忌", jokers, zhangwuji);
        lookJoker("周芷若", jokers, zhouzhiruo);
        lookJoker("赵敏", jokers, zhaomin);
        lookJoker("底牌", jokers, dipai);

    }

    public static void lookJoker(String name, Map<Integer, String> jokers, Set<Integer> who) {
        System.out.print(name + "的牌--->");
        for (Integer index : who) {
            System.out.print(jokers.get(index) + " ");
        }
        System.out.println();
    }
}