package com.zlf.work3;

/**
 * * a.行为：
 * * 吼叫:汪汪叫
 * * 吃饭:狗啃骨头
 * * 缉毒:用鼻子侦测毒
 */
public class PoliceDog extends Dog implements Police {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void shut() {
        System.out.println("汪汪叫");
    }

    @Override
    public void call110() {
        System.out.println("用鼻子缉毒");
    }
}
