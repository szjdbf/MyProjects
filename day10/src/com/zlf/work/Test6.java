package com.zlf.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10\\word.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\result.txt"));
        List<String> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        //删除长度小于4的单词
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < 4) {
                list.remove(i);
                i--;
            }
        }
        //将单词写入到文件中
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
