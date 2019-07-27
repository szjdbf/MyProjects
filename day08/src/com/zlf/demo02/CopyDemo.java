package com.zlf.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\lemon\\Pictures\\Camera Roll\\WIN_20180729_18_29_57_Pro.jpg");
        OutputStream out = new FileOutputStream("C:\\Users\\lemon\\Desktop\\ass.png");

        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }

        in.close();
        out.close();
    }
}
