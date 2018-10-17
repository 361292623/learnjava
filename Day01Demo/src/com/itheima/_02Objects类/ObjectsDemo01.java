package com.itheima._02Objects类;

import java.util.Objects;

/*
* Objects类：
*     是一个工具类。
*     它与Object类没有特殊关系，虽然写法很像，它依然是Object类的子类。
*     JDK 1.7 以后的新技术。
*
*     常用方法：
*       (1) public static boolean equals(Object a, Object b)
           比较对象a和b是否相同，相同返回true，否则false
           底层是依赖于对象的equals方法进行比较。
*
*      （2） public static Object requireNonNull(Object obj):
             判断obj是否为null，如果不为null，则不抛异常，将对象obj作为返回值返回。
             如果obj为null则抛出异常。

       （3） public static boolean isNull(Object obj)
	         判断对象obj是否为null，为null返回true，否则false
	         JDK 1.8以后才有的方法。
*/
public class ObjectsDemo01 {
    public static void main(String[] args){
        Student swk = new Student();
        Student zbj = new Student();
        //System.out.println(swk.equals(zbj));
        // 判断两个引用变量是否是指向了同一个对象。
        System.out.println(Objects.equals(swk,zbj));

      /*  String name =  null;
        Object rs = Objects.requireNonNull(name);
        System.out.println(rs);*/

      String name = "itheima";
      name = null ;
      //System.out.println(Objects.isNull(name));
      System.out.println(name == null);

    }
}
