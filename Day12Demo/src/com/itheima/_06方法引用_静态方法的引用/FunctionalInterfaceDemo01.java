package com.itheima._06方法引用_静态方法的引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
什么是方法引用
    通过类名或对象名引用已经存在的方法来简化lambda表达式。
    lambda ==> 简化函数式接口的匿名内部类创建对象的代码。
    方法引用 ==> 简化lambda表达式的代码。

    核心: 简化代码，装逼（20%），80%依然是为后面的技术做准备的。
    新技术，有必要，需要掌握。


方法引用的格式
    *   类名::方法名
    *   对象名::方法名

方法引用的分类
    * 1.静态方法引用
    * 2.对象方法引用
    * 3.特定类型实例方法引用
    * 4.构造器引用


方法引用的好处
    简化lambda表达式的代码。

研究方法引用方式一： 方法引用_静态方法的引用;
    格式：类名::方法名

    静态方法引用的注意事项
     被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表完全一致。（重要）
     如果函数式接口中的抽象方法有返回值，则被引用的方法必须也有相同的返回值
     如果函数式接口中的抽象方法没有返回值，则被引用的方法可以有返回值，也可以没有返回值。
*
* */
public class FunctionalInterfaceDemo01 {
    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("孙悟空",1000,"98期"));
        stus.add(new Student("蜘蛛精",1111,"98期"));
        stus.add(new Student("紫霞",898,"97期"));

      /*  Collections.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

     /*   Collections.sort(stus,( o1,  o2) -> {
                return o1.getAge() - o2.getAge();
        }); */

        //Collections.sort(stus,( o1,  o2) ->  o1.getAge() - o2.getAge() );

        // 提供一个静态方法把简化的代码进行封装。
       // Collections.sort(stus,( o1,  o2) ->  Student.compareByAge(o1,o2) );

        // 最终简化：静态方法的引用： 格式：类名::方法名称
        Collections.sort(stus, Student::compareByAge );

        System.out.println(stus);
    }
}
