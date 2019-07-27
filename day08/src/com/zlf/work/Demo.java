package com.zlf.work;

import java.io.File;
import java.util.Date;

public class Demo {
    /**
     * 找到自己的idea项目文件夹。打印出所有的.java文件。
     */
    public static void main(String[] args) {
        File f = new File("G:\\IdeaProjects");
        printJava(f);

    }

    //使用递归打印该文件夹下的所有文件的绝对路径
    public static void printJava(File f) {
        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printJava(file);
                } else {
                    String path = file.getName();
                    if (".class".equals(path.substring(path.indexOf(".")))) {
                        System.out.println(file.getAbsolutePath() + "  " + new Date(file.lastModified()));
                    }
                }
            }
        }
    }
}