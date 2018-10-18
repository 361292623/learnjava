package com.itheima._07泛型类的创建;


/*
* 泛型类：
*     一个类如果使用了泛型就是泛型类。
*
* 泛型类的格式：
*   [修饰符] class 类名<泛型变量>{
*
*   }
*
* 泛型变量的常用名称：可以写 E T K V
*      其实其他的字母也是可以作为泛型变量的，只是不太规范!
*
* 需求：模拟sun公司做一个ArrayList类似的泛型类。
*
* 泛型的核心：其实就是把泛型变量全部替换成具体传输过来的数据类型。
*
*/
public class FanXingLei {
    public static void main(String[] args){
        MyArrayList<String> lists = new MyArrayList<>();
        lists.add("Java");
        lists.add("Java EE");
        lists.remove("Java");
        System.out.println(lists);


        MyArrayList<Integer> lists1 = new MyArrayList<>();
        lists1.add(12);
        lists1.add(13);
    }
}
