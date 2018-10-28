package com.itheima._11常用函数式接口;

import java.util.function.Supplier;

/*
*  Supplier接口:(生产数据)
*     Supplier是泛型接口，一个生产者，用来生产数据，生产数据的类型通过泛型变量指定。
*
*  Supplier接口的源码：
*    @FunctionalInterface
     public interface Supplier<T> {
        T get(); // 生产数据的结果类型
     }

 */
public class SupplierDemo01 {
    public static void main(String[] args) {
       /* Supplier<String> sup = new Supplier<String>() {
            @Override
            public String get() {
                return "欢迎加入黑马程序员！";
            }
        };*/

        // 生产数据的格式：以后别的框架会基于这个规范来做数据的生产和获取
        Supplier<String> sup = ()  -> "欢迎加入黑马程序员！";
        Supplier<String> sup1 =()  -> "欢迎加入黑马程序员！abcdef".toUpperCase();

        System.out.println(sup.get());
        System.out.println(sup1.get());
    }
}

