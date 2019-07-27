package com.zlf.demo03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("day09\\src\\56.txt");
        Writer w = new FileWriter("C:\\Users\\lemon\\Desktop\\asd.txt",true);

        char[] buf = new char[124];
        int len;
        while ((len = r.read(buf)) != -1) {
            w.write(buf, 0, len);
        }

        r.close();
        w.close();
        System.out.println("复制完毕...");
    }
}
