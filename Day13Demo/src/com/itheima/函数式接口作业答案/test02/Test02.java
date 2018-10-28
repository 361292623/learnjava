package com.itheima.函数式接口作业答案.test02;

/**
 - 阐述函数式接口的概念
    * 有且仅有一个抽象方法的接口。

 - 阐述@FunctionallInterface注解的作用
    * 用来定义接口，编译器将会强制检查该接口是否确实有且仅有一个抽象方法，否则将会报错。

 - 请定义一个函数式接口Eatable，内含抽象eat方法，没有参数或返回值。使用该接口作为方法的参数，
 并进而通过Lambda来使用它。
 - 请定义一个函数式接口Sumable，内含抽象sum方法，可以将两个int数字相加返回int结果。使用该接
 口作为方法的参数，并进而通过Lambda来使用它。
 */
@FunctionalInterface
interface Eatable {
    public abstract void eat();
}
@FunctionalInterface
interface Sumable {
    int sum(int a, int b);
}

public class Test02 {
    public static void main(String[] args){
        eat(()-> System.out.println("吃饭"));

        Sumable sumable = (int a, int b)-> a + b;
        int result = sum(10,20,sumable);
        System.out.println(result);
    }

    /**
     * 函数式接口作为参数
     * @param s
     */
    public static int sum(int a, int b, Sumable s) {
        return s.sum(a,b);
    }

    /**
     * 函数式接口作为参数
     * @param e
     */
    public  static  void eat(Eatable e) {
        e.eat();
    }
}
