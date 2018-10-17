package com.itheima._10finally;

import java.io.FileInputStream;
import java.io.IOException;

/*
* finally:
*     格式：
*     try{
*
*     }catch(异常类型 变量){
*
*     }catch(异常类型 变量){
 *
 *    }finally{
 *
 *    }
 *
 *    catch: 1 - N次
 *    finally : 0 - 1次
 *    finally至多只能写一个
 *
 *    finally是无论try中的代码是正常执行，还是出现了异常结束的
 *    最终一定会执行一次finally里面的代码。
 *    除非通过  System.exit(0); 退出JVM否则finally一定会执行一次

 *
 *    finally有啥用呢？
 *        释放资源。
 *        在代码全部结束完成以后，做资源回收动作。
 *
 *    资源：如果有close方法基本上一定是资源。
 *        资源一定实现了Closeable接口。
 *
 *   JDK 1.7以后不建议使用finally释放资源。
 *   JDK 1.7以后释放资源的新方式：
 *    try(
 *        // 只能放置资源，用完会自动关闭
 *
 *    ){
 *
 *     }catch(异常类型 变量){
 *
 *     }
 *
*
* */
public class FinallyDemo01 {
    public static void main(String[] args) {

        try (
                FileInputStream is = new FileInputStream("D:/mv.jpg");
                ){
            //int c1 = 10 / 0 ;

            int c = 10/ 0 ;
            System.out.println(c);
            // is.close(); 不行的
        }catch (Exception e){
            e.printStackTrace();
        }


     /*   FileInputStream is = null;
        try {
            //int c1 = 10 / 0 ;
            is = new FileInputStream("D:/mv.jpg");

            int c = 10/ 0 ;
            System.out.println(c);
           // is.close(); 不行的
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("==finally==");
            // 释放资源！
            try {
                if(is != null )  is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
