package com.zlf.demo01;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Comparator是一个比较器接口，当TreeSet不想使用默认的排序规则时，可以自定义一个实现类，自定义排序规则
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        //传递一个Comparator的匿名实现类对象
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length();
            }
        });
        ts.add("asdlm");
        ts.add("z");
        ts.add("ds");
        ts.add("sdpogkpdr");
        ts.add("jdv");
        System.out.println(ts);


        //按照总分排序（从小到大）
        TreeSet<People> pe = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getSum() - o2.getSum();
            }
        });
        pe.add(new People("张杰", 99, 99));
        pe.add(new People("唐嫣", 99, 95));
        pe.add(new People("胡歌", 98, 99));
        pe.add(new People("谢娜", 99, 80));
        System.out.println(pe);
    }
}

class People {
    String name;
    int chinese;
    int math;

    public int getSum() {
        return chinese + math;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                '}' + ",总分" + getSum();
    }

    public People(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }
}
