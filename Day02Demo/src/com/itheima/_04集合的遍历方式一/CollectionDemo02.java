package com.itheima._04集合的遍历方式一;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args){
        Collection<Student> stus = new ArrayList<>();
        stus.add(new Student("孙悟空1",1000,'公'));
        stus.add(new Student("孙悟空2",1000,'公'));
        stus.add(new Student("孙悟空3",1000,'公'));
        stus.add(new Student("孙悟空4",1000,'公'));
        System.out.println(stus);
        // stus = [stu1 , stu2 , stu3 ,stu4 ]
        //   it

        // 使用迭代器遍历
        // （1）获取当前被遍历集合的迭代器
        Iterator<Student> it = stus.iterator();
        while(it.hasNext()){
            Student stu =  it.next();
            System.out.println(stu);
        }

    }
}
