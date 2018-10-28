package com.itheima._10数组的构造器引用;

import java.util.Arrays;

/*
*  数组构造的引用。
*
*
*/
public class ArraysDemo01 {
    public static void main(String[] args){
      /*  int[] arrs = createArr(new ArrayBuild() {
            @Override
            public int[] buildArray(int length) {
                return new int[length];
            }
        }, 10);*/

     /*   int[] arrs = createArr(length -> {
                return new int[length];
        }, 10);*/

        //int[] arrs = createArr(length -> new int[length] , 10);

        int[] arrs = createArr(int[]::new ,10);

        System.out.println(Arrays.toString(arrs));
    }

    // 调用方法返回一个数组
    public static int[] createArr(ArrayBuild build , int length){
       return build.buildArray(length);
    }
}

@FunctionalInterface
interface ArrayBuild{
    // 创建一个数组并返回
    int[] buildArray(int length);
}