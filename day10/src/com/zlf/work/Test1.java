package com.zlf.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day10\\data.txt");
        fw.write("12342352");
        fw.close();

        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("day10\\data.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '3') {
                    count++;
                }
            }
        }
        br.close();

        System.out.println("字符3的个数共有" + count + "个");

    }
}
