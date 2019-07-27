package com.zlf.demo01;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) throws IOException {
        InetAddress i = InetAddress.getByName("192.168.41.77");

        System.out.println(i.getHostAddress());//获取主机地址
        System.out.println(i.getHostName());//获取主机名

    }
}
