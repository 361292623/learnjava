package com.itheima._04可变参数与集合无任何关系属于方法的技术;
/*
* 可变参数的注意事项：
*     一个方法中只能有一个可变参数。
*     可变参数必须放在形参列表的最后面
* */
public class MethodDemo03 {
    public static void main(String[] args) {
        test(1,2,3,4,50);
    }

    public static void test(int age , String name1 , String...names){

    }

    public static void test(int age ,int...nums){

    }
}
