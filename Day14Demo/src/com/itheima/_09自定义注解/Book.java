package com.itheima._09自定义注解;

public @interface Book {
    // 定义属性
    String name();
    String author() default "Dlei";
    int nums() ;
    String publication();
}
