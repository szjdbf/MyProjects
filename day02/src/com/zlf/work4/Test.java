package com.zlf.work4;

/**
 * 分析以下需求，并用代码实现
 * 进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
 * (1) a.USB接口:
 * 开启功能
 * 关闭功能
 * <p>
 * b.笔记本类:
 * 开机功能
 * 关机功能
 * c.笔记本中定义使用USB设备的功能
 * 要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能
 * <p>
 * (3)鼠标类:
 * 要符合USB接口
 * <p>
 * (4)键盘类:
 * 要符合USB接口
 * <p>
 * (5)测试类:
 * 创建电脑对象,依次调用开机方法,使用USB设备, 关机方法
 * <p>
 * (6)打印效果如下:
 * 开机
 * 连接鼠标的USB
 * 断开鼠标的USB
 * 连接键盘的USB
 * 断开键盘的USB
 * 关机
 */
public class Test {
    public static void main(String[] args) {
        MacBook mb = new MacBook();

        Mouse m = new Mouse();
        KeyBoard k = new KeyBoard();

        mb.startUp();
        mb.use(m);
        mb.use(k);
        mb.shutDown();
    }
}
