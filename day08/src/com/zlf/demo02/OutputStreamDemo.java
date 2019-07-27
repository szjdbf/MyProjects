package com.zlf.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("day08\\src\\com\\zlf\\abc.txt");

        out.write(97);
        out.write("\r\n".getBytes());//写入换行符
        out.write(98);

        out.write(99);
        out.write(100);
        out.write("abcdefg".getBytes());
        out.write("\r\n".getBytes());//写入换行符
        out.write("床前明月光".getBytes());

        out.close();
    }
}
