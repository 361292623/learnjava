package com.itheima._05编译时异常的处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 编译时异常的处理机制：
 *    编译时异常是编译阶段一定会出错的.
 *    所以编译时异常是必须需要处理的，否则程序编译都无法通过。
 *
 * 异常的处理：
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
 *
 *    (2) 出现异常的地方，自己捕获处理。不麻烦别人。
 *        捕获处理的格式：
 *           try{
 *              // 监视可能出现异常的代码。
 *           }catch(异常类型 变量){
 *
 *           }catch(异常类型 变量){
 *
 *           }
 *
 *           try{
 *              // 监视可能出现异常的代码。
 *           }catch(异常类型|异常类型|.. 变量){
 *
 *           }
 *
 *           企业捕获方式：
 *           try{
 *              // 可能出现异常的代码。
 *           }catch(Exception e){
 *              e.printStackTrace(); // 打印异常信息。
 *           }
 *
 *           自己捕获处理其实也可以，但是并不规范
 *
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        parseTimer("2018-10-09 19:22:22");
        System.out.println("程序结束");
    }

   public static void parseTimer(String timeStr){
        try{
            SimpleDateFormat sdf =
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(timeStr);

            InputStream is = new FileInputStream("D:/mv.png");

            System.out.println(d);

        }catch (Exception e){
            // 拦截到出现异常的对象e
            // 把异常打印或者随便你做什么（业务需求而定）
            e.printStackTrace(); // 打印异常信息。
           // System.out.println(e.getMessage()); // 输出异常原因
            //System.out.println("您这次执行出现了错误，请注意！");
        }

    }


 /*   public static void parseTimer(String timeStr){
        try{
            SimpleDateFormat sdf =
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(timeStr);

            InputStream is = new FileInputStream("D:/mv.png");

            System.out.println(d);

        }catch (ParseException | FileNotFoundException e){

        }

    }*/


    /*public static void parseTimer(String timeStr){
        try{
            SimpleDateFormat sdf =
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(timeStr);

            InputStream is = new FileInputStream("D:/mv.png");

            System.out.println(d);

        }catch (ParseException e){

        }catch (FileNotFoundException e){

        }

    }*/

}
