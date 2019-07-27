package com.zlf.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\lemon\\Videos\\QQplayerClip\\123.mp4");
        OutputStream out = new FileOutputStream("C:\\Users\\lemon\\Desktop\\123.mp4");

        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        System.out.println("复制完毕。。。");
    }

}
