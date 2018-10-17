package com.itheima._03Date日期类的详细使用;

import java.util.Date;

/*
  Date日期类的构造器
 （1） public Date() : 得到此刻当前日期
*（2） public Date(long date)：可以把时间毫秒值转成日期对象
*
* */
public class DateDemo03 {
    public static void main(String[] args){
        // 创建此刻日期对象
        Date d = new Date();
        System.out.println(d);

        // 把日期对象转成时间毫秒值
        // Date => long
        long time = d.getTime();
        // 请问 63s 后是什么时间?
        // 把时间毫秒值往后走63s
        time += 63*1000 ;

        // 把时间毫秒值转换成日期对象
        // long => Date
        Date d1 = new Date(time);
        System.out.println(d1);
    }
}
