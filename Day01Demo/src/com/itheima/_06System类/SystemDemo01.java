package com.itheima._06System类;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/*
* System:系统类
*     代表的当前程序所在的操作系统。
*
*     1.public static long currentTimeMillis()
       获得当前时间的毫秒值


     2.public static void arraycopy(Object src, int srcPos,
        Object dest, int destPos, int length)：
        * 数组复制
        * src：源数组 要复制的数组
        * srcPos：源数组的起始索引
        * dest：目标数组
        * destPos：目标数组的起始索引
        * length：要复制的元素个数

 public static void gc()：了解
    通知垃圾回收器回收垃圾

 public static void exit(int status)：
     退出JVM，终止程序运行。
     status:
     0：表示正常终止
     -1：表示是异常终止

public static Properties getProperties()：
    * 获得当前操作系统相关属性信息。比如：操作系统名称
*
* */
public class SystemDemo01 {
    public static void main(String[] args){
        // (1) 获得当前时间的毫秒值(建议这样获取时间毫秒值)
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));

        // System.exit(0); // 结束程序！

        // (2)做数组拷贝（数组复制）
        int[] arrs1 = new int[]{10,20,30,40,70,60};
        int[] arrs2 = new int[6];
        // 需求：把arrs1中的 30 40 70
        // 复制到 arrs2 中的 [0 , 30 , 40 , 70 , 0 , 0]
        /*
        * arraycopy(Object src,  int srcPos,Object dest, int destPos, int length)
        * 参数一：需要被复制的原数组
        * 参数二：从那个元素索引位置开始复制
        * 参数三：要复制到那个数组
        * 参数四：复制到哪个索引位置开始
        * 参数五：要复制多少个元素。
        */
        System.arraycopy(arrs1,2,arrs2,1 , 3);
        System.out.println(Arrays.toString(arrs2));

      /*  String name = "itheima";
        name = null;*/
        // (3) gc()：了解
        // System.gc();

        // 获取系统的全部属性信息
        System.out.println(System.getProperties());
        // 获取某个属性信息
        System.out.println(System.getProperty("java.version"));
    }
}
