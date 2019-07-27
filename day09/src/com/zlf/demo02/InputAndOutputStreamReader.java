package com.zlf.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter:从字符流到字节流的桥梁
 * <p>
 * InputStreamReader：从字节流到字符流的桥梁
 * <p>
 * 默认使用平台的编码格式，可以指定编码格式和解码格式
 * <p>
 * 使用字符流时，会先写到缓冲区中，需要关闭流才能写入
 */
public class InputAndOutputStreamReader {
    public static void main(String[] args) throws IOException {
        //字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day09\\123.txt", true), "utf-8");
        //字符输入流
//      InputStreamReader isr = new InputStreamReader(new FileInputStream("day09\\src\\789.txt"));
        osw.write("你好呀，中国");
        System.out.println(osw.getEncoding());
        osw.flush();
        osw.close();
    }
}
