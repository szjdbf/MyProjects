package com.zlf.work3;

/**
 * 3.
 * 按要求完成下面的代码:
 * (1)动物类：
 * <p>
 * a.行为：
 * 吼叫；没有具体的吼叫行为
 * 吃饭:没有具体的吃饭行为
 * (2)缉毒接口
 * a.行为:
 * 缉毒
 * (3)缉毒狗:犬的一种
 * a.行为：
 * 吼叫:汪汪叫
 * 吃饭:狗啃骨头
 * 缉毒:用鼻子侦测毒
 * (4)测试类:
 * a.使用多态的形式创建缉毒狗对象,调用缉毒方法和吼叫方法
 */
public class Test {

    public static void main(String[] args) {
        Dog d = new PoliceDog();
        ((PoliceDog) d).call110();
        d.eat();
        d.shut();
    }
}
