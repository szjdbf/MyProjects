package com.zlf.demo03;

/**
 * Lambda表达式省略规则
 * <p>
 * 1.参数类型可以省略
 * 2.当且仅有一个参数时，()可以省略
 * 3.当代码块当且仅有一句时，{;}和return可以省略
 * <p>
 * Lambda必须用于一个接口
 * 接口只能有一个方法
 * <p>
 * 匿名内部类在编译后会生成单独的class文件
 * Lambda不会生成
 */
public class Demo {
    public static void main(String[] args) {
        useAddable((x, y) -> x + y);
    }


    public static void useAddable(Addable a) {
        System.out.println("结果是" + a.add(3, 5));
    }
}
