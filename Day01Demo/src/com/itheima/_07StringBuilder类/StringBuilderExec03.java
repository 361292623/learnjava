package com.itheima._07StringBuilder类;

import java.util.Arrays;

/*
* StringBuilder做一个Arrays.toString(int[] arrs)
* 输出数组的内容
*
* */
public class StringBuilderExec03 {

    public static void main(String[] args){
        int[] arrs = new int[]{20,30,40,50};
        System.out.println(arrs);
        System.out.println(Arrays.toString(arrs));
        // [20, 30, 40, 50]
        System.out.println(StringBuilderExec03.toString(arrs));
    }

    public static String toString(int[] arrs){
        // [20, 30, 40, 50]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0 ; i < arrs.length ; i++ ){
            sb.append(i==arrs.length-1?arrs[i]:arrs[i] + ", ");
        }
        sb.append("]");

        // 把sb对象转成字符串返回！
        return sb.toString();
    }
}
