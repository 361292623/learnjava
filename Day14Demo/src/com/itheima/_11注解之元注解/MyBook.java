package com.itheima._11注解之元注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
*
元注解概述
    元注解是用在注解上的注解。

    * Java官方提供的注解
    * 用来定义注解的注解
    * 任何官方提供的非元注解的定义都使用到了元注解。

常用的元注解
    * @Target
        * 作用：用来标识注解使用的位置，如果没有使用该注解标识，
             则自定义的注解可以使用在任意位置。
        * 可使用的值定义在ElementType枚举类中，常用值如下
            TYPE，类，接口
            FIELD, 成员变量
            METHOD, 成员方法
            PARAMETER, 方法参数
            CONSTRUCTOR, 构造方法
            LOCAL_VARIABLE, 局部变量

    * @Retention
        * 作用：用来标识注解的生命周期(有效范围)
        * 可使用的值定义在RetentionPolicy枚举类中，常用值如下
            * SOURCE：注解只作用在源码阶段，生成的字节码文件中不存在
            * CLASS：注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认方法
            * RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段 开发用的最多
*
* */
@Target({ElementType.FIELD,ElementType.TYPE}) //申明MyBook这个注解只能注解成员变量
@Retention(RetentionPolicy.SOURCE) // 申明注解的生命周期。
public @interface MyBook {
    String name();
    double price() default 100;
    String[] authors();
}
