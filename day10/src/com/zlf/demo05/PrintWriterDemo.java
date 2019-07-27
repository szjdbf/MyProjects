package com.zlf.demo05;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter("day10\\data.txt");


        out.println(Integer.MAX_VALUE);

        out.close();
    }
}
