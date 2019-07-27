package com.zlf.demo01;

import java.io.File;
import java.io.IOException;


/**
 * createNewFine();创建新文件
 * mkdir();创建单级目录
 * mkdirs();创建多级目录
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("G:\\abc\\a.txt");
        //创建新文件
        boolean b = f1.createNewFile();
        System.out.println(b);
        //创建多级目录
        File f2 = new File("G:\\abc\\cde\\efg");
        boolean mkdir = f2.mkdirs();
        System.out.println(mkdir);
    }
}
