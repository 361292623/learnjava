package com.itheima._09自定义注解;
/*
* 自定义注解：
*    自己来设计一个注解。
*
* 定义格式：
*   public @interface 注解名{

    }
    如：定义一个名为Student的注解
    public @interface MyBook {

    }

  注解的属性：
  属性的格式
    - 格式1：数据类型 属性名();
    - 格式2：数据类型 属性名() default 默认值;

  属性适用的数据类型:
    * 八种数据数据类型(int，short，long，double，byte ，char，boolean，float)
    * String，Class，注解类型，枚举类
    * 以上类型的数组形式




* */
@MyBook
public class TestBook01 {
}
