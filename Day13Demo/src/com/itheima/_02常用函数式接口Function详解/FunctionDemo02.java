package com.itheima._02常用函数式接口Function详解;

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

 默认方法：andThen
      Function 接口中有一个默认的 andThen 方法，
      用来进行组合操作,可以完成一系列功能。
      “前面的功能的结果一定会作为后面功能的入参(原材料)！！！”

      default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        return (T t) -> p2.apply(p1.apply(t));
      }

* */
public class FunctionDemo02 {
    public static void main(String[] args) {
        // 字符串转成整数
        Function<String , Integer> p1 =  Integer::valueOf ;
        // 然后加上1
        Function<Integer,Integer> p2 = s -> ++s ;
        // 最后输出 : "求和结果是：" ?
        Function<Integer,String> p3 = s -> "求和结果是："+s ;

        String rs = p1.andThen(p2).andThen(p3).apply("123");
        System.out.println(rs);
    }

    // 需求：现在有一个数字字符串
    //    请把它转成整数
    //    然后加上1
    //    最后输出 : "求和结果是：" ?
}
