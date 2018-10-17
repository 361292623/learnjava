package com.itheima._05编译时异常的处理;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 编译时异常的处理机制：
*    编译时异常是编译阶段一定会出错的.
*    所以编译时异常是编译阶段必须需要处理的，否则程序编译都无法通过。
*
* 异常的处理（三种）：
*    （1）出现异常的地方抛出去给调用者，调用者可能也不想管。可以继续抛出去。..
*
*     抛出格式：
*        [修饰符] 返回值类型 方法名称([形参列表]) throws 异常类型1,异常类型2,..{
*
*        }
*
*     这种方式是不负责任的，每个人都不管异常，异常最终给了JVM虚拟机。
*     这个其实就是JVM默认处理方式。
*
*     建议直接抛出throws Exception,可以代表一切异常的抛出。
* */
public class ExceptionDemo01 {

    public static void main(String[] args) throws Exception {
        parseTimer("2018-10-09 19:22:22");
    }

    public static Date parseTimer(String timeStr)
            throws Exception {

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(timeStr);

        InputStream is = new FileInputStream("D:/mv.png");

        return d ;
    }




 /*   public static void main(String[] args) throws ParseException, FileNotFoundException {
        parseTimer("2018-10-09 19:22:22");
    }

    public static Date parseTimer(String timeStr) throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(timeStr);

        InputStream is = new FileInputStream("D:/mv.png");

        return d ;
    }*/

}
