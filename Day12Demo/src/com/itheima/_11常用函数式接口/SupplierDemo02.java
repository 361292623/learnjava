package com.itheima._11常用函数式接口;

import java.util.function.Supplier;

/*
*  求数组元素最大值
*  没什么用！
* */
public class SupplierDemo02 {
    public static void main(String[] args) {
        // 定义一个整型数组
        int[] arr = {1, 1313,13,13143};
        /*int maxData = testSupplier(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int maxData = arr[0] ;
                for(int data : arr){
                    if(data > maxData){
                        maxData = data;
                    }
                }
                return maxData;
            }
        });*/
        /*int rs = testSupplier(() -> {
            return getMax(arr);
        });*/

         int rs = testSupplier(() -> getMax(arr) );
         System.out.println(rs);
    }

    // 获取数组的最大值
    /*
    * 参数一：生产数据的对象
    * */
    public static int testSupplier(Supplier<Integer> supplier ){
        return supplier.get();
    }

    public static int getMax(int[] arr){
        int maxData = arr[0] ;
        for(int data : arr){
            if(data > maxData){
                maxData = data;
            }
        }
        return maxData;
    }

}
