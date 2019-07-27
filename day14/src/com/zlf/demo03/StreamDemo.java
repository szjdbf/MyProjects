package com.zlf.demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collection体系下的所有集合都可以调用stream()方法生成流
 * <p>
 * 数组可以通过Stream.of(T...) 生成流
 * <p>
 * limit(long maxSize):截取指定参数个数的数据
 * <p>
 * skip(long n):跳过指定参数个数的数据，返回由该流剩余元素组成的流
 * <p>
 * distinct();//去除重复的元素，根据equals方法判断
 * <p>
 * sorted();按照元素的自然顺序排序,可以传递Comparator接口的实现类
 * <p>
 * count();//返回元素的个数
 * <p>
 * collect();//将元素收集到集合中
 * <p>
 * Stream.concat(Stream s1,Stream s2):
 */
public class StreamDemo {

    public static void main(String[] args) {
        //将开头为张，并且长度为3的姓名打印
        List<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");
        names.add("张三丰");
        names.add("殷离");
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);


        Stream<Integer> s = Stream.of(10, 20, 30, 40);
        System.out.println(s);

        List<String> c = names.stream().filter(ss -> ss.length() == 2).collect(Collectors.toList());
        System.out.println(c);
    }


}
