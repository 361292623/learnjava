package com.itheima._06.泛型在集合中的使用;

import java.util.ArrayList;
import java.util.Collection;

/*
泛型的概述
    * JDK1.5新特性。
    * 泛型可以使用在方法中，类上，接口上。
    * 泛型其实就是一个标签，用来约束一个类在编译阶段只能操作某个数据类型。

泛型在集合中使用的好处
      将运行期错误转换为编译器错误，增强了集合的安全性。
      避免了类型强制转换的麻烦和可能出现的错误。

泛型在集合中的使用注意事项
    * 在泛型中，没有多态的概念，要么指定左边，要么两边都指定相同的数据类型。
    * 在JDK1.7之后，泛型后面的类型申明可以省略不写。
*
* */
public class CollectionDemo01 {
    public static void main(String[] args){
        //Collection<String> lists = new ArrayList<String>();
        Collection<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Java");
        lists.add("Java EE");
        // foreach
        for(String ele : lists){
            System.out.println(ele);
        }

    }
}
