package com.zlf.demo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) {
        File srcFolder = new File("C:\\Users\\lemon\\AppData\\Roaming\\feiq\\Recv Files");
        File desFolder = new File("day10", srcFolder.getName());
        desFolder.mkdir();

        File[] files = srcFolder.listFiles();
        for (File src : files) {
            String fileName = src.getName();
            File des = new File(desFolder, fileName);
            copy(src, des);
        }
    }

    public static void copy(File src, File des) {
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
