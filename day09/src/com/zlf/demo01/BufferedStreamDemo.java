package com.zlf.demo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //当文件不存在时，会创建该文件
        //字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lemon\\Pictures\\5a5f148ec6a43.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day09\\src\\123.jpg"));

        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
            bos.write(buf, 0, len);
        }


        bis.close();
        bos.close();
    }
}
