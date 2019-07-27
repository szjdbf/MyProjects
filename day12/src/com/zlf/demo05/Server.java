package com.zlf.demo05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);
        Socket s = server.accept();
        InputStream in = s.getInputStream();
        OutputStream out = new FileOutputStream("C:\\Users\\lemon\\Desktop\\123.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
            out.flush();
        }

        OutputStream o = s.getOutputStream();
        o.write("上传完毕".getBytes());
        server.close();
    }
}
