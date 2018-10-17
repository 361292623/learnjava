package com.itheima._03Date日期类的详细使用;

import java.util.Date;

/*
* Date:日期时间类：代表的当是前系统此刻日期对象。
*     所以可以通过创建Date日期的对象来得到系统此刻时间。
*
* 创建对象：
*    构造器：
*       （1） public Date() : 得到此刻当前日期
*       （2） public Date(long date)：可以把时间毫秒值转成日期对象
*
* 常用方法：
*    public long getTime() : 获取时间的毫秒值。
*
* 常识：
*    在Java中时间的记录存在两种形式
*    第一种是：Date日期类型时间：此刻时间
*    第二种是：时间毫秒值，从1970-01-01 00:00:00走到此刻的总的时间毫秒值
*      1s = 1000ms
*
* */
public class DateDemo01 {
    public static void main(String[] args){
        // 01.创建对象:得到系统此刻当前日期对象：此刻时间。
        Date d = new Date();
        System.out.println(d);

        // 02.获取一个时间毫秒值。
        // Date => long
        // 日期    时间毫秒值
        long timer = d.getTime();
        System.out.println(timer);


    }
}
