package com.itheima._04DateFormat日期格式化类;

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
*   （2）可以把字符串的时间解析成一个Date日期对象。
*
* */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args){
        //（1）可以把Date日期类或者时间毫秒值进行时间格式化。
        Date d = new Date();
        System.out.println(d);

        // 创建一个简单日期格式化对象 :
        // 参数：指定格式化时间的形式
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss a EEE");

        // 使用简单日期格式化对象把Date日期转换成格式化时间形式
        String rs = sdf.format(d);
        System.out.println(rs);
    }
}
