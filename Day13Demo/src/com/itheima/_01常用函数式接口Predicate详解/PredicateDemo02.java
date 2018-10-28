package com.itheima._01常用函数式接口Predicate详解;

import java.util.function.Predicate;

/*
* 常用函数式接口：
*   有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。
*   这时可以使用
    java.util.function.Predicate<T> 接口

    Predicate ：条件判断接口。
    唯一的抽象方法：
         boolean test(T t);
    这个接口封装了与或非的操作：
         与：and方法
             判断两个条件是否同时满足。
               default Predicate<T> and(Predicate<? super T> other) {
                    return (t) -> p1.test(t) && p2.test(t);
                }
         或：or方法
         非：negate方法
*
* */
public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean rs = check( s -> s.contains("W") , s -> s.length() >= 6 , "HelloWord");
        System.out.println(rs);
    }

    // 判断密码要包含W,并且长度需要大于等于6
    public static boolean check( Predicate<String> p1 , Predicate<String> p2 , String data){
        return p1.and(p2).test(data);
    }
}
