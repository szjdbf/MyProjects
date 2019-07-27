package com.zlf.demo01;

import java.io.File;
import java.io.IOException;

/**
 * 绝对路径：以盘符开始的路径
 * 相对路径:不以盘符开始，以当前项目或文件夹开始
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f = new File("day08\\src");
        //创建文件
//        f.createNewFile();
        //删除文件
        //当文件夹下有内容时，不能直接删除
        //f.delete();
        System.out.println(f.getAbsolutePath());//绝对路径
        System.out.println(f.getPath());//封装的路径（构造方法中存放的路径）


        System.out.println(f.isDirectory());//判断是否为目录
        System.out.println(f.isFile());//判断是否为文件
        System.out.println(f.exists());//判断是否存在

        String[] list = f.list();//将该目录下的所有文件或文件夹放到String数组中
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = f.listFiles();//将该目录下的所有文件或文件夹放到File数组中
        for (File file : files) {
            System.out.println(file);
        }
    }
}
