package com.itheima._10自定义注解的练习题;
/*
*
*定义一个注解：MyBook

- 包含属性：String name()   书名
- 包含属性：double price()  价格，默认值为 100
- 包含属性：String[] authors() 多位作者
*
* */
public @interface MyBook {
    String value();
    String name();
    double price() default 100;
    String[] authors();
}
