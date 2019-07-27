package com.zlf.demo01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 在UTF-8编码格式中，一个汉字占三个字节
 * 在GBK编码中，一个汉字占两个字节
 * <p>
 * 使用什么格式编码，就要用什么格式解码
 * <p>
 * "中国".getBytes(String);编码
 * new String(byte[],String);解码
 */
public class EncodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bytes = s.getBytes("gbk");//当指定了编码格式，就要用指定的格式解码
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes, "gbk"));
    }
}
