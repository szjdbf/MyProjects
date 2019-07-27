package com.zlf.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP接收端
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //接受指定端口的数据
        DatagramSocket ds = new DatagramSocket(10000);

        byte[] buf = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        while (true) {
            //接收数据
            ds.receive(dp);
            //返回数据缓冲区
            System.out.println("收到的数据是:" + new String(buf, 0, dp.getLength()));
        }

    }
}
