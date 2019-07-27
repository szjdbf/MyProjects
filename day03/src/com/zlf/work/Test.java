package com.zlf.work;

interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();

        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("showshow");
            }
        });
        System.out.println("--------------");

        InterA ia = new InterA() {
            @Override
            public void showA() {
                System.out.println("showshow...");
            }
        };
        a.methodA(ia);
        System.out.println("--------------");

        a.methodA(new InterAImpl());
    }

}
