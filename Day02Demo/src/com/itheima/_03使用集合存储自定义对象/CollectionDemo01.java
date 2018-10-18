package com.itheima._03使用集合存储自定义对象;

import java.util.ArrayList;
import java.util.Collection;

/*
* 使用集合存储自定义对象：
*   开始使用泛型来约束集合操作的数据类型。
*
*   集合只能存放引用数据类型。泛型也只能支持引用数据类型。
*   所以不支持基本数据类型
*
* */
public class CollectionDemo01 {
    public static void main(String[] args){
        Collection<String> lists = new ArrayList<String>();
        lists.add("Java");
        lists.add("Java EE");

        Collection<Integer> lists1 = new ArrayList<Integer>();
        lists1.add(12); // 自动装箱
        lists1.add(13); // 自动装箱

        // JDK 1.7以后集合后面的泛型类型申明可以省略不写。
        Collection<Integer> lists2 = new ArrayList<>();
        Collection<String> lists3 = new ArrayList<>();

        Collection<Student> stus = new ArrayList<>();
        Student swk = new Student("孙悟空",1000,'公');
        Student swk1 = new Student("孙悟空",1000,'公');
        Student zzj = new Student("蜘蛛精",1111,'母');
        Student zzj1 = new Student("蜘蛛精",1111,'母');
        stus.add(swk);
        stus.add(zzj);
        stus.add(swk1);
        stus.add(zzj1);
        System.out.println(stus);
    }
}
