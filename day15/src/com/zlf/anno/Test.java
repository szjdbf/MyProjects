package com.zlf.anno;

@MyAnno(className = "com.zlf.demo01.C1", method = "show")
public class Test {
    public static void main(String[] args) {
        //获取本类的字节码对象
        Class<?> clazz = Test.class;
        //获取注解,会在内存中生成一个继承该注解的实现类
        MyAnno an = clazz.getAnnotation(MyAnno.class);
        System.out.println(an);
        String className = an.className();
        String method = an.method();
        System.out.println(className);
        System.out.println(method);
    }
}
