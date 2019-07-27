package com.zlf.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 模拟打牌
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //花色
        String[] color = {"♥", "♠", "♦", "♣"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //创建集合，将牌放到集合中
        List<String> jokers = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                jokers.add(c + n);
            }
        }
        jokers.add("s🐱");
        jokers.add("b🐱");
        //打乱集合
        Collections.shuffle(jokers);
        //System.out.println(jokers);
        //创建三个集合对象，当作三个人
        List<String> zhangwuji = new ArrayList<>();
        List<String> zhouzhiruo = new ArrayList<>();
        List<String> zhaomin = new ArrayList<>();
        //底牌
        List<String> dipai = jokers.subList(jokers.size() - 3, jokers.size());

        //遍历牌集合模拟发牌
        for (int i = 0; i < jokers.size()-3 ; i++) {
            int joker = i % 3;
            switch (joker) {
                case 0:
                    zhangwuji.add(jokers.get(i));
                    break;
                case 1:
                    zhouzhiruo.add(jokers.get(i));
                    break;
                case 2:
                    zhaomin.add(jokers.get(i));
                    break;
            }
        }

        System.out.println("张无忌的牌--->" + zhangwuji);
        System.out.println("周芷若的牌--->" + zhouzhiruo);
        System.out.println("赵敏 的 牌--->" + zhaomin);
        System.out.println("底牌--->" + dipai);

    }
}