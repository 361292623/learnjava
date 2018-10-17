package com.itheima._06运行时异常的处理机制;
/*
* 运行时异常的处理机制：
*    运行时异常编译阶段一定不会出错，是运行阶段才可能会出错的。
*    所以运行时异常编译阶段不处理也不会报错。
*
*    运行时异常无需程序员手工抛出，自动抛出，因为自动抛出也不会报错。
*
*    按照规范运行时异常也应提前处理： 异常都应该处理
*    运行时异常 在最外层捕获处理即可,底层会自动抛出。
*
* */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            System.out.println(chu(10,2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("程序结束");
    }

    public static int chu(int a , int b){
        int c = a / b ;
        System.out.println("方法结束");
        return  c;
    }
}
