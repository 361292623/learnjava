package com.itheima._09自定义异常;
/*
* 自定义异常：
*     Java为程序可能出现的一切问题都设计了一个异常类型。
*     除0 空指针
*     然后我们就可以用异常机制去捕获这些异常类型并提前处理。
*
*     Java也认为有些技术是程序员可能因为自己的技术水平有限而出现错误。
*     Java也设计了很多编译时异常，提前让程序有小心和处理。
*
*     虽然Java总结了很多异常类型，但是Java不能为现实世界所有的异常都设计一个异常类型，
*     因为异常是无法预知有多少种。
*
*     如果一个公司认为自己的某个业务是一个异常，他想用一个异常来代表这个业务出现的问题
*     那么这个公司应该自己定义自己特有的异常类型：自定义异常。
*
*
*     自定义异常分为：
*        编译时异常
*        运行时异常
*
*/
public class TestMain02 {
    public static void main(String[] args)  {
        System.out.println("开始");
        try{
            setAge(11111);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("结束");
    }

    public static void setAge(int age){
        // 可以认为 age<=0 || age >=200 就是一个异常。
        if( age <= 0 || age >=200 ) {
            // throw : 创建一个异常对象，自动从这里抛出。
            // throws :把已经出现的异常从方法抛出去给方法的调用者
            throw new AgeXiaChuanRuntimeException("您的年龄非法！");
        }else{
            System.out.println(age);
        }
    }
}
