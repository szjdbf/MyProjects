package com.zlf.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * UDP:面向无连接，不安全，效率高
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if ("exit".equals(str)) break;
            //数据包
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 10000);
            //发送
            ds.send(dp);
        }
        //释放资源
        sc.close();
        ds.close();

    }
}
