package com.itheima._07方法引用_对象方法的引用;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
* 方法引用：
*     只能简化Lambda表达式的代码。
*     必须先有Lambda表达式代码，才存在方法引用的简化。
*
*     lambda ==> 简化函数式接口的匿名内部类创建对象的代码。
      方法引用 ==> 简化lambda表达式的代码。

      函数式接口 -> Lambda表达式 -> 方法引用。

 方法引用的分类
    * 1.静态方法引用
    * 2.对象方法引用
    * 3.特定类型实例方法引用
    * 4.构造器引用
    *

 方法引用方案二：对象方法的引用
        对象方法引用的格式：对象名::非静态方法名
        对象方法引用的注意事项
         * 被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。(重要，强制性的)
         * 如果函数式接口中的抽象方法有返回值，则被引用的方法必须也有相同的返回值
         * 如果函数式接口中的抽象方法没有返回值，则被引用的方法可以有返回值，也可以没有返回值。
*
* */
public class ObjectMethodYinYongDemo01 {
    public static void main(String[] args) {
        // 1.函数式接口的匿名对象：最低级写法
       /* RandomIntF r = new RandomIntF() {
            @Override
            public void getRanData(int bounds) {
                Random ran = new Random();
                System.out.println(ran.nextInt(bounds));
            }
        };*/

        // 2.Lambda表达式：属于中级写法
       /* RandomIntF r = bounds -> {
                Random ran = new Random();
                System.out.println(ran.nextInt(bounds));
        };
        r.getRanData(10);*/

        // 3.封装成对象方法:属于中高级过度的写法
       /* MyRandomClass rc = new MyRandomClass();
        RandomIntF r = bounds ->  rc.getRandomData(bounds);
        r.getRanData(10);
        */

       // 4.方法引用：对象方法引用，终极写法
        MyRandomClass rc = new MyRandomClass();
        RandomIntF r = rc::getRandomData ;
        r.getRanData(10);

        // ------------------拓展-------------------------------
        List<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("Oracle");
        lists.add("Mysql");
        lists.add("Tomcat");
        lists.add("JSP Servlet");
       /* lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        // lists.forEach( s -> System.out.println(s) );

        // Lambda，参数一样。对象方法。
        lists.forEach(System.out::println);

    }
}

class MyRandomClass{
   public void getRandomData(int bounds){
       Random ran = new Random();
       System.out.println(ran.nextInt(bounds));
   }
}

//1.现有函数式接口
@FunctionalInterface
interface RandomIntF{
    void getRanData(int bounds);
}