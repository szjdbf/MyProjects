package com.zlf.demo05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream(new FileOutputStream("day10\\data.txt", true));
        for (int i = 0; i < 100; i++) {
            out.println(i);
        }
        out.close();
    }
}
