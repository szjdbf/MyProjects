package com.zlf.work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\data.txt"));

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("请输入第" + i + "个字符串");
            String str = sc.nextLine();
            bw.write("第" + i + "行:" + str);
            bw.newLine();
        }

        //释放资源
        sc.close();
        bw.close();
    }
}
