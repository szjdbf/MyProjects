package com.zlf.demo04;

public class Test {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();
        ThreadDaemon td3 = new ThreadDaemon();

        td1.setName("主程序");
        td2.setName("聊天");
        td3.setName("视频");

        td2.setDaemon(true);//将该线程设置为守护线程，当只剩下守护线程时，JVM停止运行
        td3.setDaemon(true);

        td1.start();
        td2.start();
        td3.start();

    }
}
