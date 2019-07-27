package com.zlf.demo05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 使用客户端/服务器上传文件
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10000);
        OutputStream out = s.getOutputStream();
        InputStream in = new FileInputStream("C:\\Users\\lemon\\Pictures\\time.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
            out.flush();
        }
        //关闭输出流
        s.shutdownOutput();

        InputStream i = s.getInputStream();
        byte[] b = new byte[1024];
        int l = i.read(b);
        System.out.println(new String(b, 0, l));
        s.close();
    }
}
