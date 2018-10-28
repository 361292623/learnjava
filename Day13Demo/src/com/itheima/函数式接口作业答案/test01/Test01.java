package com.itheima.函数式接口作业答案.test01;

/**
 * @author pkxing
 * @version 1.0
 * @description com.itheima._01Lambda延迟执行案例
 * @date 2018/3/19
 */

// 接口
interface BuilderMessage{
    String buildeMessage();
}

public class Test01 {
     public static void main(String[] args){
         String str1 = "rose";
         String str2 = System.currentTimeMillis()+"";
         String str3 = "访问了某个网页";


        // 使用lambda表达式调用log方法
        log(1,()-> {
            System.out.println("level= 1 ");
            return str1+str2+str3;
        });
        log(2,()->{
            System.out.println("level= 2 ");
            return str1+str2+str3;
        });
     }

    /**
     * 记录日志
     * @param level  日志级别
     * @param bulider 日志信息
     */
     public static void log(int level,BuilderMessage bulider){
         if (level == 1) { // 用户日志
             System.out.println(bulider.buildeMessage());
         }
     }
}
