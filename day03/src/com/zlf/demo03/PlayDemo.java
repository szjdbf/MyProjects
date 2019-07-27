package com.zlf.demo03;

/**
 * 参数是接口，实际需要的是接口的实现类对象
 * 返回类型是接口，实际返回的是接口的实现类对象
 */
public class PlayDemo {

    public static void main(String[] args) {
        Play p = new Xiaoming();
        usePlay(p);

        Play p2 = getPlayImpl();
        p2.playGame();
    }

    // 方法的参数是一个接口 ， 传递的是接口的实现类的对象
    public static void usePlay(Play p) {
        p.playGame();
    }

    // 接口作为方法的返回值,返回的是接口实现类的对象
    public static Play getPlayImpl() {
        return new Xiaoming();
    }

}
