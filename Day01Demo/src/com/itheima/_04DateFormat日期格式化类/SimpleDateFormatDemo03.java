package com.itheima._04DateFormat日期格式化类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat类:
 *    日期格式化类。
 *    DateFormat是一个抽象类，抽象类是不能直接使用的。
 *    必须使用它的子类：SimpleDateFormat（简单日期格式化类）
 *
 * SimpleDateFormat的常用构造器：
 *   （1）public SimpleDateFormat(String pattern)
 *
 * SimpleDateFormat的常用功能：
 *   （1）可以把Date日期类或者时间毫秒值进行时间格式化。
 *         -- String format(Date date)
 *         -- String format(Object obj)
 *
 *   （2）可以把字符串的时间解析成一个Date日期对象。
 *
 *      SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 开始解析 ： d 此时的时间就是 2018-10-08 10:10:10
        Date d = sdf.parse(timeStr);
 *
 *
 *        面试题：
 *            随便给你一个时间”2018-10-08 10:10:10“
 *            请问 3天 14小时 50分 50s 后的时间是多少。
 *
 *        思路：
 *           a.先定义一个字符串的时间”2018-10-08 10:10:10“
 *           b.把字符串的时间解析成Date日期对象（这一步还不会）
 *           c.把Date日期对象转成时间毫秒值
 *           d.把时间毫秒值往后走3天 14小时 50分 50s
 *           e.把时间毫秒值格式化输出。
 */
public class SimpleDateFormatDemo03 {
    public static void main(String[] args) throws ParseException {
        //  a.先定义一个字符串的时间”2018-10-08 10:10:10“
        String timeStr = "2018-10-08 10:10:10";
        //  b.把字符串的时间解析成Date日期对象（开始懂了）
        //  简单日期格式化对象的参数：必须与被解析时间的格式完全一致
        //  否则不能解析，并且解析会导致程序异常。
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 开始解析 ： d 此时的时间就是 2018-10-08 10:10:10
        Date d = sdf.parse(timeStr);

        // c.把Date日期对象转成时间毫秒值
        long time = d.getTime();

        // d.把时间毫秒值往后走3天 14小时 50分 50s
        time += (3*24*60*60*1000 + 14*60*60*1000 + 50*60*1000 + 50*1000);

        // e.把时间毫秒值格式化输出。
        System.out.println(sdf.format(time));
    }
}
