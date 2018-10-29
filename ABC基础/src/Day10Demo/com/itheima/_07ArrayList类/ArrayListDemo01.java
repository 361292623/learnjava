package Day10Demo.com.itheima._07ArrayList类;

import java.util.ArrayList;

/*
*  ArrayList类代表的是一个集合。
*    集合是一个容器。
*    数组也是容器，但是数组的大小固定，类型固定的。
*    集合的大小是不固定的，可以存放任意类型的数据。

   java.util.ArrayList 是大小可变的数组的实现，存储在内的数据称为元素。
   此类提供了一些方法来操作内部存储的元素。
   的元素。
   ArrayList 中可不断添加元素，其大小也自动增长。

   开发中的很多数据是不断增加的或者不断删除的。
   ArrayList用的挺多的。

   1.创建一个ArrayList的对象。
      public ArrayList()
*
*/
public class ArrayListDemo01 {
    public static void main(String[] args){
        // 创建了一个集合对象：创建了一个瓶子。
        ArrayList names = new ArrayList();
        names.add("徐明明");
        names.add(12);
        names.add("杨斌");
        names.add("马里红");
        names.add(true);
        names.add(true);
        System.out.println(names);

        // 常用的API.
    }
}
