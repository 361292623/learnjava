package com.itheima._07StringBuilder类;
/*
* StringBuilder类 :
*     可变字符串类，用来做字符串运算的（字符串的拼接，反转，增删改查的）
*     性能较好
*
* String类：
*    不可变字符串类。
*    做字符串运算的时候会不断产生垃圾对象，性能较差！！
*
* */
public class StringBuilderDemo01 {
    public static void main(String[] args){
        /*String name = "itheima";
        name += "欢迎";
        name +="您";
        name += "加入Java世界";
        System.out.println(name);*/

        // 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        // 拼接功能
        sb.append("itheima");
        sb.append("欢迎");
        sb.append("您");
        sb.append("加入Java世界");
        System.out.println(sb);

        // 优雅式编程！！
        StringBuilder sb1 = new StringBuilder();
        // 拼接功能
        // append方法每次拼接完成以后又会返回sb1对象，所以可以继续拼接。
        sb1.append("itheima")
            .append("欢迎")
            .append("您")
            .append("加入Java世界");
        System.out.println(sb);
    }
}
