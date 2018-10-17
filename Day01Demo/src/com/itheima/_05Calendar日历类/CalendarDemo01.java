package com.itheima._05Calendar日历类;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar:
*    代表的日历类。
*    日历从理论上来看比Date日期类更加的强大。
*
* 创建日历对象：
*     Calendar rightNow = Calendar.getInstance();
*
*
* */
public class CalendarDemo01 {
    public static void main(String[] args){
        // 获取一个当前时间对于的日历。
        Calendar rightNow1 = Calendar.getInstance();
        /*Calendar rightNow2 = Calendar.getInstance();
        System.out.println(rightNow1 == rightNow2);*/

        System.out.println(rightNow1);

        // 单独获取年
        int year = rightNow1.get(Calendar.YEAR);
        System.out.println(year);

        int date = rightNow1.get(Calendar.DATE);
        System.out.println(date);

        int mm = rightNow1.get(Calendar.MONTH) + 1;
        System.out.println(mm);

        // 获取一年中的第几天
        int days = rightNow1.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);


        // 日历的其他功能
        // 日历的getTime返回的是当前日期对象
        Date d = rightNow1.getTime();
        System.out.println(d);

        // 获取时间毫秒值
        long time = rightNow1.getTimeInMillis();
        System.out.println(time);

        // 需求：21天后是什么日期？
        // 就是让日历往后翻21天。
        // 先得到今天是一年中的第几天
       /* int cdays = rightNow1.get(Calendar.DAY_OF_YEAR);
        cdays+=21 ;*/
        // 让日历往后翻21天。
        // 参数一：一年中的第几天
        // 参数二：走到这一天。
        //rightNow1.set(Calendar.DAY_OF_YEAR,cdays);

        // 让一年中的第几天往后直接走21天！！ 更加简单！
        rightNow1.add(Calendar.DAY_OF_YEAR,21);
        Date d1 = rightNow1.getTime();
        System.out.println(d1);
    }
}
