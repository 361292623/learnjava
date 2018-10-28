package com.itheima._02常用函数式接口Function详解;

import java.net.InetAddress;
import java.util.function.Function;

/*
* Function接口：
* java.util.function.Function<T,R> 接口用来根据一个类型的数据（原材料）得到
   另一个类型的数据（成品），前者称为前置条件，
   后者称为后置条件。有进有出，所以称为“函数Function”

  Function接口：是一个功能接口，也是一个工厂接口。
      Function的核心功能：你给我一个数据（原材料），我加工好后返回一个结果(成品)给你。

  唯一抽象方法：
     抽象方法：apply
      R apply(T t);  // t是原材料 R是成品结果。

*
* */
public class FunctionDemo01 {
    public static void main(String[] args) {
        /*需求是 请帮我把一个数字字符串转换成一个整数。
        Function<String,Integer> f1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                // 把字符串转成整数
                int rs = Integer.valueOf(s);
                return rs;
            }
        };*/
        //Function<String,Integer> f1 = s -> Integer.valueOf(s);
        Function<String,Integer> f1 = Integer::valueOf;
        int it = f1.apply("123");
        System.out.println(it);

        // 在拓展
       // func( s -> reverse(s) , "helloWorld");
        func( FunctionDemo01::reverse , "helloWorld");
    }


    // 需求：我给你一个字符串，最终返回它的倒序。
    // 原材料：String
    // 成品：String
    public static void func(Function<String,String> p1 , String data){
        String rs = p1.apply(data);
        System.out.println(rs);
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}
