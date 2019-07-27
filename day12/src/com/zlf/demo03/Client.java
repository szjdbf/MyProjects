package com.zlf.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //TCP客户端
        Socket s = new Socket("127.0.0.1", 10000);

        //获取输出流
        OutputStream out = s.getOutputStream();

        //向服务器端发送数据
        out.write("百度啊百度，快点回我信息".getBytes());

        //获取输出流，获取服务器响应的信息
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println("客户端收到信息:" + new String(buf, 0, len));

        //释放资源
        s.close();
    }
}
