package com.zlf.demo06;

public final class Father {

    /**
     * 只能在本类中访问
     */
    private void show1() {

    }

    /**
     * 同一个包中访问
     */
    void show2() {

    }

    /**
     * 可以在不同包的（子类内部）使用
     */
    protected void show3() {

    }

    /**
     * 不同包可以使用
     */
    public void show4() {

    }
}
