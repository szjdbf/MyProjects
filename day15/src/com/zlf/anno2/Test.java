package com.zlf.anno2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws IOException {
        Calc c = new Calc();
        Class<Calc> cls = Calc.class;
        Method[] methods = cls.getMethods();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day15\\bug.txt"));
        int num = 0;
        for (Method method : methods) {
            //判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    num++;
                    bw.write("异常所在的方法" + method.getName());
                    bw.newLine();
                    bw.write("异常的类型" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次共发现" + num + "个异常");
        bw.close();

    }
}
