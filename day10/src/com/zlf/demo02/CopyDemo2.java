package com.zlf.demo02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class CopyDemo2 {
    public static void main(String[] args) {
        File srcFolder = new File("C:\\Users\\lemon\\Desktop\\test");
        File desFolder = new File("day10");
        copy(srcFolder, desFolder);
    }

    public static void copy(File src, File des) {
        File desFolder = new File(des, src.getName());
        desFolder.mkdir();
        File[] files = src.listFiles();
        System.out.println(Arrays.toString(files));
        for (File file : files) {
            if (file.isDirectory()) copy(file, desFolder);
            else {
                copyFile(file, new File(desFolder, file.getName()));
            }
        }
    }

    public static void copyFile(File src, File des) {
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
