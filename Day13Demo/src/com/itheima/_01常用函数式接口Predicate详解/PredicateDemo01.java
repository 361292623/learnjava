package com.itheima._01常用函数式接口Predicate详解;

import java.util.function.Predicate;

/*
* 常用函数式接口：
*   有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。
*   这时可以使用
*    java.util.function.Predicate<T> 接口
*
*    Predicate ：条件判断接口。
*    唯一的抽象方法：
*         boolean test(T t);
*    这个接口封装了与或非的操作：
*         与：and方法
*         或：or方法
*         非：negate方法
*
* */
public class PredicateDemo01 {
    public static void main(String[] args) {
        // 需求：测试用户密码是否长度大于等于6
        /*Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() >= 6;
            }
        };*/
       /* Predicate<String> p1 = s -> s.length() >= 6;
        System.out.println(p1.test("00197"));*/

       checkPwd(s -> s.length() >= 6 , "003197");
       checkPwd(s -> s.contains("W"),"helloWord");
    }

    // 使用方法封装校验密码的功能
    public static void checkPwd(Predicate<String> p1 , String pwd){
        System.out.println(p1.test(pwd));
    }
}








