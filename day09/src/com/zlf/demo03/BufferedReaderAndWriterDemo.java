package com.zlf.demo03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriterDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day09\\src\\56.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09\\src\\78.txt"));

        String line;
        while ((line = br.readLine()) != null) {//读取的每一行不包括换行符
            bw.write(line);
            bw.newLine();//根据操作系统写入换行符
        }

        br.close();
        bw.close();
    }

}
