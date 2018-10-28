package com.itheima._02函数式接口;
/*
*函数式接口的概念
     接口中有且只有一个抽象方法的接口就称为函数式接口。

     函数式接口，即适用于函数式编程场景的接口。
     而Java中的函数式编程体现就是Lambda，
     所以函数式接口就是可以适用于Lambda使用的接口。
     只有确保接口中有且仅有一个抽象方法，
     Java中的Lambda才能顺利地进行推导。

     Lambda表达式只能简化函数式接口的匿名内部类对象。

     @FunctionalInterface注解：
     @Override:用来修饰方法声明，告诉编译器该方法是重写父类的方法，如果父类方法该方法则编译失败。
     @FunctionalInterface：（申明这个接口必须是函数式接口，否则报错）
         用来修饰接口的，告诉编译器该接口是函数式接口，如果不是，则编译失败。
*
* */
public class FunctionalInterfaceDemo01 {
}

// 函数式接口
@FunctionalInterface
interface CookFood{
    void eat();
}