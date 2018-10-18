package com.itheima._05自定义函数式接口;

public class TestMain02 {
    public static void main(String[] args) {
    /*   CookFood01 ck = new CookFood01() {
            @Override
            public void cook(String name, String user) {
                System.out.println(user+"在做"+name+"给你吃！");
            }
        }; */
        // lambda表达式
      /*  CookFood01 ck = (String name, String user) -> {
            System.out.println(user+"在做"+name+"给你吃！");
        };*/

        // 类型可以去掉 ，多个参数（）不能省略 ，变量随便
       /* CookFood01 ck = (n,  u) -> {
            System.out.println(u+"在做"+n+"给你吃！");
        };*/

        /*
        *  一行代码省略大括号 {}
        * */
        CookFood01 ck = (n,  u) -> System.out.println(u+"在做"+n+"给你吃！");

        ck.cook("鱼儿","徐磊");

    }
}
