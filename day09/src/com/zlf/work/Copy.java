package com.zlf.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) {
        String src = "C:\\Users\\lemon\\Pictures\\time.jpg";
        String des = "C:\\Users\\lemon\\Desktop\\time.jpg";
        copyImage(src, des);
    }

    public static void copyImage(String src, String des) {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream(src));
            out = new BufferedOutputStream(new FileOutputStream(des));

            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

