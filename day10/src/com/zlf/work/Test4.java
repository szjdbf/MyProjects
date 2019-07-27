package com.zlf.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10\\test.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(new StringBuilder(line).reverse());//字符串反转是StringBuilder特有的方法
        }

        br.close();
    }
}
