package com.zlf.demo06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 使用客户端上传文件
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10000);
        Scanner sc = new Scanner(System.in);
        //获取输出流
        OutputStream out = s.getOutputStream();

        //用户输入的文件路径
        System.out.println("请输入文件路径：");
        String path = sc.nextLine();
        File f = new File(path);
        String name = f.getName();//文件名
        //将文件名写入到输出流
        out.write(name.getBytes());

        //读取文件
        InputStream in = new FileInputStream(f);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);//将数据写入到输出流
        }
        in.close();
        //告诉服务器传输数据结束
        s.shutdownOutput();
        s.close();
    }

}
