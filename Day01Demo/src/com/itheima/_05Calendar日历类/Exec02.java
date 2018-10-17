package com.itheima._05Calendar日历类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  请使用日期时间相关的API，计算出一个人已经出生了多少天。
 *
 *  石子涵 ： 1996-01-07 10:10:10
 *
 */
public class Exec02 {
    public static void main(String[] args) throws ParseException {
        // 定义出生日期
        String birth = "1996-01-07 10:10:10";
        // 解析时间
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 解析成日期对象
        Date d = sdf.parse(birth);
        // 换算成出生的时间毫秒值
        long birthTime = d.getTime() ;
        // 获取当前此刻时间对象
        long cTime = new Date().getTime();
        // 计算 石子涵 同学走过的总的时间毫秒值。
        long t = cTime -  birthTime ;
        // 换算成天
        double days = t * 1.0 / 1000 / 60 / 60 / 24 ;
        System.out.println(days);

    }
}
