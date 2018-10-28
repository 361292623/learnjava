package com.itheima._01常用函数式接口Predicate详解;

import java.util.function.Predicate;

/*
* * 常用函数式接口：
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
             判断两个条件满足其一即可。
              default Predicate<T> or(Predicate<? super T> other) {
                    return (t) -> test(t) || other.test(t);
              }

         非：negate方法
             对一个条件的结果进行取反。
             default Predicate<T> negate() {
                    return (t) -> !test(t);
             }
*/
public class PredicateDemo04 {
    public static void main(String[] args) {
        System.out.println(chechAge(s -> s >= 18 , 8));
    }

    // 年龄大于18岁的 返回false, 小于18岁返回true.
    public static boolean chechAge(Predicate<Integer> p1 , int age){
        return p1.negate().test(age);
    }

}
