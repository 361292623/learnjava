package com.itheima._10自定义注解的练习题;

public @interface Book {
    String value();
    String name() default "dlei";
}
