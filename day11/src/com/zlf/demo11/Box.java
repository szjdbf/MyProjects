package com.zlf.demo11;

public class Box {
    private int num;
    private boolean state;

    public synchronized void put(int num) {
        if (!state) {//如果没有牛奶
            this.num = num;
            System.out.println("牛奶工生产了第" + num + "瓶奶");
            state = true;
            notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public synchronized void get() {
        if (state) {//如果有牛奶
            System.out.println("学生喝了第" + num + "瓶奶");
            state = false;
            notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
