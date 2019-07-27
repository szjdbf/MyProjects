package com.zlf.demo09;

/**
 * 奶箱类
 */
public class Box {

    private int num;//生产的瓶数
    public boolean state;//状态

    //生产
    public void put(int num) {
        this.num = num;
        System.out.println("送奶工生产了第" + num + "瓶奶");
    }

    //消费
    public void get() {
        System.out.println("学生喝了第" + num + "瓶奶");
    }
}
