package com.zlf.work2;

public class NewPhone extends  Phone implements IPlay {
    @Override
    public void playGame() {
        System.out.println("打游戏的新功能");
    }
}
