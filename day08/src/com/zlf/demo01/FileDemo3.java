package com.zlf.demo01;

import java.io.File;

public class FileDemo3 {

    public static void main(String[] args) {
        File f = new File("C:/");

        printAllFiles(f);
    }

    //使用递归打印该文件夹下的所有文件的绝对路径
    public static void printAllFiles(File f) {
        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printAllFiles(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }


}
