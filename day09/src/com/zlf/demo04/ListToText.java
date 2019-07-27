package com.zlf.demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListToText {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09\\src\\123.txt", true));

        List<String> list = new ArrayList<>();
        list.add("中国");
        list.add("世界");
        list.add("第一");

        for (String s : list) {
            bw.write(s);
            bw.newLine();
            //bw.flush();可以不用写
        }

        bw.close();
        System.out.println("写入完成...");
    }
}
