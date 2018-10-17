package com.itheima._04可变参数与集合无任何关系属于方法的技术;

import java.util.ArrayList;
import java.util.Arrays;

/*
* 可变参数：
*    一个方法可以接收任意多个同类型的参数。
*    只能用于方法的形参中的。
* 格式：
*    数据类型...变量名称
*
*  注意：
*     可变参数在方法中其实就是一个数组。
*
*
* */
public class MethodDemo01 {
    public static void main(String[] args) {
        //test(); // 可以一个参数也不传。
        //test(1); // 可以传输一个参数
        //test(1,2,3,4,5); // 可以传输多个参数
        test(new int[]{1,2,3,4}); // 可以传输一个数组
    }

    public static void test(int...nums){
        // 可变参数其实就是一个数组。
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
