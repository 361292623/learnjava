package com.itheima._04Lambda表达式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
* @FunctionalInterface：
*      Comparator 是一个函数式接口。
*
* */
public class LambdaDemo03 {

    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("孙悟空",1000,"98期"));
        stus.add(new Student("蜘蛛精",1111,"98期"));
        stus.add(new Student("紫霞",898,"97期"));

        // 排序：
       /* Collections.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 规则
                return o1.getAge() - o2.getAge();
            }
        });*/

       // Lambda简化
       /* Collections.sort(stus,(Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });*/

       // 类型可以去掉。
     /*   Collections.sort(stus,( o1,  o2) -> {
            return o1.getAge() - o2.getAge();
        });*/

        // 如果只有一行代码｛｝是可以省略的，如果有return ,return 必须去掉
        Collections.sort(stus,( o1,  o2) -> o1.getAge() - o2.getAge() );

        System.out.println(stus);

    }

}
