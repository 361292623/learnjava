package com.itheima._03test;

import java.sql.Timestamp;

/**
 * @author pkxing
 * @version 1.0
 * @Package com.itheima._03test
 * @date 2018/11/22  上午10:00
 */
public class Demo01 {

    public static void main(String[] args){
        // 获得当前系统时间
        long currentTime = System.currentTimeMillis();
        // 创建时间戳对象
        Timestamp currentDate = new Timestamp(currentTime);
        System.out.println(currentDate);
    }
}
