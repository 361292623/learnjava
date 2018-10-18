package com.itheima._05集合的遍历方式二;


import java.util.ArrayList;
import java.util.Collection;

/*
*
* foreach遍历（增强for）：
*    foreach遍历既可以遍历集合也可以遍历数组。
*    注意：迭代器只能遍历集合
*
* foreach的格式：
*    for(被遍历集合或者数组中元素的类型  变量 : 被遍历集合或者数组){
*         // 输出变量
*    }
*
* foreach建议记住格式就可以解决所有问题。
*
* */
public class CollectionDemo01 {
    public static void main(String[] args){
        // 遍历数组
        int[] arrs = new int[]{90,80,85,98};
        // (1) foreach遍历
        for(int ele : arrs){
            System.out.println(ele);
        }

        System.out.println("-----------------------------");
        String[] names = new String[]{"孙悟空","猪八戒","紫霞仙子","至尊宝"};
        //                             name
        for(String name : names ){
            System.out.println(name);
        }

        System.out.println("-----------------------------");
        Collection<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Java EE");
        lists.add("Oracle"); // it
        lists.add("Mysql");
        lists.add("Spring Boot");
      /*
       //
        foreach:是不能边遍历边删除。
        for(String book : lists){
            System.out.println(book);
            // 并发修改异常，foreach遍历集合不能边遍历边修改集合否则报错。
            *//* if(book.equals("Oracle")){
                lists.remove("Oracle");
            }*//*
        }*/

       /*
        // 迭代器是： 可以边遍历边删除
        Iterator<String> it = lists.iterator();
        while(it.hasNext()){
            String book = it.next();
            if(book.equals("Oracle")){
                it.remove(); // 删除迭代器当前所在位置的元素。
            }
        }
        */
        System.out.println(lists);
        System.out.println("-----------------------------");
        Collection<Student> stus = new ArrayList<>();
        stus.add(new Student("孙悟空1",1000,'公'));
        stus.add(new Student("孙悟空2",1000,'公'));
        stus.add(new Student("孙悟空3",1000,'公'));
        stus.add(new Student("孙悟空4",1000,'公'));
        for(Student s : stus){
            System.out.println(s);
        }
    }
}
