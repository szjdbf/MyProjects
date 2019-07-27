package com.zlf.demo04;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10000);

        Socket socket = s.accept();

        InputStream in = socket.getInputStream();
        //包装为字符缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        //将收到的信息存到文件中
        FileOutputStream o = new FileOutputStream("day12\\abc.txt");

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println("服务器：" + str);
            o.write(str.getBytes());
            s.close();
        }
    }
}
