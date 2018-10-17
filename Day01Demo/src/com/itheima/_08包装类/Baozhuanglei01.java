package com.itheima._08包装类;
/*
* 包装类：
*     Java认为一切都是对象。只要一个东西是类就一定能实现皆对象。
*     但是Java中的基本数据类型他们不是对象，他们只是一个数据类型。
*     Java为了实现一切皆对象的思想统一，把基本数据类型全部转成
*     了类的形式，这种形式称为基本数据类型的包装类。
*     基本数据类型    包装类
*     byte          Byte
*     short         Short
*     int           Integer(特殊)
*     long          Long
*     float         Float
*     double        Double
*     char          Character(特殊)
*     boolean       Boolean
*
* */
public class Baozhuanglei01 {
    public static void main(String[] args){
        int age = 12 ; // 不是对象，是基本数据类型
        // 自动装箱：可以自动的把基本数据类型的值或者变量转成包装类的实例。
        Integer age1 = 12 ; //  自动装箱 是整数的对象了
        Integer age2 = age ; // 自动装箱 是整数的对象了
        // age2 = null ;


        // 自动拆箱：可以自动被包装类的实例转成基本数据类型。
        Integer it = 100 ;
        int i = it ; // 自动拆箱

        // 手动装箱(强烈不建议)
        Integer it1 = Integer.valueOf(12);
        Integer it2 = 12;

        // 手动拆箱（强烈不建议）
        Integer it3 = 111 ;
        int i2 = it3; // 自动拆箱
        int i3 = it3.intValue(); // 手动拆箱

    }
}
