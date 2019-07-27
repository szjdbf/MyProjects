package com.zlf.demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 服务器端
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);

        //监听客户端连接，返回Socket对象
        Socket s = server.accept();

        //获取输入流
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];

        //读取数据
        int len = in.read(buf);
        System.out.println("服务器收到信息" + new String(buf, 0, len));

        //向客户端响应数据
        OutputStream out = s.getOutputStream();
        out.write(("我收到你的信息啦，给你一个当前时间" +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).getBytes());

        //释放资源
        server.close();
    }
}
