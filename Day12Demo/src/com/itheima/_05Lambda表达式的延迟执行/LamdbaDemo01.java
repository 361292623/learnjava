package com.itheima._05Lambda表达式的延迟执行;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

/*
* Lambda表达式的延迟执行:
*    (1)这是新技术的特性。
*    (2)提高代码的性能，节约资源。
*
*    使用lambda表达式的主要原因是：
*        将代码的执行延迟到一个合适的时间点。
*        所有的lambda表达式都是延迟执行的。
*
*    案例演示：
*          代码是需要做日志输出的。以后日志框架帮助你输出你的代码日志：Log4j
*
*    先示范一个：性能浪费的日志案例(功能：记录用户的登录信息)。
*/
public class LamdbaDemo01 {
    public static void main(String[] args) throws Exception {
        String name = "徐磊";

        // 记录登录的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
        String loginTime = sdf.format(System.currentTimeMillis());

        // 做什么
        String msg = "登录系统！";

        // 日志级别： 1 (记录日志),  2 , 3 ,4
        // 参数二的代码：永远都会执行，即使不需要打印日志，它也会执行：这里存在性能浪费。
        saveLog(1, name + "在" + loginTime + msg);
    }

    /*
     *
     *
     */
    public static void saveLog(int logType ,String messager) throws Exception {
       if(logType == 1){
           OutputStream os = new FileOutputStream("src/log.log",true);
           PrintStream ps = new PrintStream(os);
           ps.println(messager);
           ps.close();
       }
    }
}
