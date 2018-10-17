package com.itheima._03编译时异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 编译时异常：
*   这个异常是在编译阶段就会报错，是用来提醒程序员你的代码可能会
*             出错，请注意您的编码。
*             编译时异常一定是继承自Exception,但是一定没有继承
*             RuntimeException
*
*   编译时异常是编译阶段就会出错的，编译时异常是可遇不可求的。
*   编译时异常是人家对你的技术水平不放心，提醒你，请注意您的编码可能出错。
*
*/
public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = "2018-08-09 10:20:21";
        Date d = sdf.parse(timeStr);
        System.out.println(d);
    }
}
