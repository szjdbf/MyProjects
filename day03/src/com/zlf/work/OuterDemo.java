package com.zlf.work;

interface Inter {
    void show();
}

class Outer {
    //补齐代码
    static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
