package com.itheima._03Date日期类的详细使用;

import java.util.Date;

/*
*
* 程序的性能分析：
*     看一段代码运行所花费的时间。
*
* */
public class DateDemo02 {
    public static void main(String[] args){

        // 先在程序执行开始拿到此刻时间毫秒值
        Date d1 = new Date();
        long startTimer = d1.getTime();

        // 循环
        for(int i = 0 ; i < 100100 ; i++ ) {
            System.out.println("输出："+i);
        }

        // 在程序执行结束后拿到此刻时间毫秒值
        Date d2 = new Date();
        long endTimer = d2.getTime();

        System.out.println((endTimer - startTimer)*1.0 / 1000+"s");
    }
}
