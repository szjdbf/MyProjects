package com.zlf.demo06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        //获取输入流
        while (true) {
            //连接客户端
            Socket s = ss.accept();
            InputStream in = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);//获取文件名

            //将收到的数据写出到文件输出流
            OutputStream out = new FileOutputStream("C:\\Users\\lemon\\Desktop\\" + new String(buf, 0, len));
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            //关闭输出流
            out.close();
            s.close();
        }
    }
}
