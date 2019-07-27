package com.zlf.demo04;

/**
 * throws用在方法声明后面，跟的是异常类名
 * 表示抛出异常，由方法调用者处理
 * 不一定会出现异常
 * <p>
 * throw用在方法体内，跟的是异常对象名
 * 当执行throw，一定是出现了某种异常
 */
public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        try {
            t.checkScore(160);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}

class Teacher {
    public void checkScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            //手动抛出异常对象
            throw new ScoreException("分数应该在0-100之间");//该异常继承Exception，是编译时异常
        } else {
            System.out.println("分数正常");
        }
    }
}
