package com.itheima._04JVM虚拟机默认的异常处理机制;
/*
* JVM处理异常的默认方式：
*    流程：
*     （1）从出现异常代码的地方，自动的生成这个异常对象，然后
*         自动抛出给方法的调用者。
*     （2）方法的调用者会继续往外抛出，.. 最终抛出给JVM虚拟机。
*     （3）JVM虚拟机收到程序以后做两个动作：
*          a.直接干掉程序。
*          b.把异常栈信息（异常类型，异常原因，异常位置） 打印输出。
*/
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        System.out.println(chu(10,0));
        System.out.println("程序结束");
}

    public static int chu(int a , int b){
        // 会在这里自动的生成一个除0的异常对象，然后
        // 从这里抛出给调用者。
        int c = a / b ;
        System.out.println("方法结束");
        return  c;
    }
}
