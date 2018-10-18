package com.itheima._04Lambda表达式;
/*
* 函数式编程。
*    分支：Lambda表达式。
*    目的：表面上看式简化代码（ZB） , 深入研究是一种新型的编码设计思想。
*
*    核心：简化代码。
*
* Lambda表达式：
*    Lambda是为了简化匿名内部类的创建方式。
*    Lambda认为匿名内部类的代码太复杂了。
*
* Lambda的标准格式：（记死）
*    (数据类型1 变量, 数据类型2 变量 ,数据类型3 变量 , .. ) -> {
*
*    }
*
*    (数据类型1 变量, 数据类型2 变量 ,数据类型3 变量 , .. ):匿名内部类中被
*     重写方法的形参列表（一模一样的）
*
*     -> 无实际含义，只是一个语法，指向的是匿名内部类中被重写方法的方法体。
*
*     {} : 匿名内部类中被重写方法的方法体。
*
* Lambda表达式并不能简化所有的匿名内部类代码。
* 只能简化函数式接口的匿名内部类的创建方式：
*     函数式接口(@FunctionalInterface)：
*       （1）必须是接口
*       （2）有且仅有一个抽象方法。
*
* Lambda表达式使用前提：
*   所以Lambda表达式只能简化接口，并且接口中只能有一个抽象方法。
*
*/
public class LambdaDemo01 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0 ; i < 3 ; i++ ) {
                    System.out.println(Thread.currentThread().getName()+"=>"+i);
                }
            }
        };
        t.start();

     /*   //  Lambda表达式取简化这个代码
        Thread t1 = () ->{
            for (int i = 0 ; i < 3 ; i++ ) {
                System.out.println(Thread.currentThread().getName()+"=>"+i);
            }
        };*/
        //t1.start();
    }
}
