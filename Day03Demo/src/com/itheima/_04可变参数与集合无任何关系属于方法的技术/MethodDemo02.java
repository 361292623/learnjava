package com.itheima._04可变参数与集合无任何关系属于方法的技术;
/*
* 需求：请帮我计算一批整数的和。
*
* */
public class MethodDemo02 {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum(new int[]{1,2,2,3}));
    }

    public static int sum(int...nums){
        int count = 0 ;
        for(int num : nums){
            count+=num;
        }
        return  count;
    }
}
