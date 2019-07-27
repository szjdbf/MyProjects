package com.zlf.work4;

public class MacBook{

    public void startUp() {
        System.out.println("开机");
    }


    public void shutDown() {
        System.out.println("关机");
    }


    public void use(USB u) {
        u.open();
        u.close();
    }
}
