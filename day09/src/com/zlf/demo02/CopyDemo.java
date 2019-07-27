package com.zlf.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        Reader r = new InputStreamReader(new FileInputStream("day09\\src\\com\\zlf\\demo01\\BufferedStreamDemo.java"));
        //创建字符输出流对象
        Writer w = new OutputStreamWriter(new FileOutputStream("day09\\src\\56.txt", true));
        char[] buf = new char[256];
        int len;
        while ((len = r.read(buf)) != -1) {
            w.write(buf, 0, len);
        }

        r.close();
        w.close();
    }
}
