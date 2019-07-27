package com.zlf.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("day08\\src\\com\\zlf\\abc.txt");

//        int ch;
//        while ((ch = in.read()) != -1) {
//            System.out.print((char) ch);
//        }


        byte []b=new byte[3];
        int len;
        while((len=in.read(b))!=-1){
            System.out.print(new String(b,0,len));
        }
    }

}
