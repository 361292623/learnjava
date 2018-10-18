package com.itheima._08泛型方法;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 泛型方法：
*    一个方法如果使用了泛型就是泛型方法。
*
* 泛型方法的格式：
*    [修饰符] <T> 返回值类型 方法名称(形参列表){
*
*    }
*
*    <T> : 其实就是一个标记，说明这个方法是泛型方法，无实际含义。
*         如果<>中是T,那么泛型方法的泛型变量就必须使用T
*
*     注意：泛型只能支持引用数据类型。
*
* 需求: 随便给你一个数组，请将这个数组的全部元素反转，然后
*      把反转后的新数组返回给我。
*
*/
public class FanXingMethod01 {
    public static void main(String[] args){
        Integer[] arrs = new Integer[]{10,20,30,40,40,50};
        String[] names = new String[]{"彭文磊","石子涵","张涵予","张馨予","邓超","杨超越"};

        Integer[] arrs1 = reverse(arrs);
        System.out.println("反转后："+ toString(arrs1));

        String[] names1 = reverse(names);
        System.out.println("反转后："+ toString(names1));

    }

    // toString(arrs1)方法做成泛型方法
    public static <T> String toString(T[] arrs){
        StringBuilder sb = new StringBuilder( );
        sb.append("[");
        for(int i = 0 ; i < arrs.length ; i++ ){
            sb.append(i == arrs.length -1 ? arrs[i] :arrs[i]+",");
        }
        sb.append("]");
        return sb.toString();
    }

    // 一个方法解决这个需求：通用技术！
    public static <T> T[] reverse(T[] arrs){
        // 反转功能
        for(int i = 0 , j = arrs.length -1 ; i < j ; i++ , j--){
            // 互换 i j 位置的元素
            T temp = arrs[i];
            arrs[i] = arrs[j];
            arrs[j] = temp;
        }
        return arrs ;
    }
}
