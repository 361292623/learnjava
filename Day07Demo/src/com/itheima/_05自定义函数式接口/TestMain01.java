package com.itheima._05自定义函数式接口;

public class TestMain01 {
    public static void main(String[] args) {
       /* CookFood cook = new CookFood() {
            @Override
            public void cook(String name) {
                System.out.println("做"+name+"给你们吃！");
            }
        };*/

     /*   CookFood cook = (String name) -> {
                System.out.println("做"+name+"给你们吃！");
        };*/

        // 类型可以省略不写
        /*CookFood cook = (name) -> {
            System.out.println("做"+name+"给你们吃！");
        };*/

        // ()可以省略，只有一个参数才可以省略小括号。
     /*   CookFood cook = name -> {
            System.out.println("做"+name+"给你们吃！");
        };*/

        CookFood cook = name -> System.out.println("做"+name+"给你们吃！");
        cook.cook("鱼儿");

    }
}
