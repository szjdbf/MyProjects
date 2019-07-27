package com.zlf.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//注解可以使用在类上
@Retention(RetentionPolicy.RUNTIME)//注解在运行时也有效
public @interface MyAnno {
    //定义注解的属性,实际上注解是继承了Annotation接口的接口
    String className();

    String method();
}
