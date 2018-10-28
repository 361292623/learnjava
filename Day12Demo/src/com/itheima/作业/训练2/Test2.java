package com.itheima.作业.训练2;

public class Test2 {
    public static void main(String[] args) {
       getProduct(8, 9, (int a, int b)->a*b);


    }
    static void getProduct(int a , int b ,IntCalc calc){
        System.out.println(calc.calc(a,b)); ;
    }
}

@FunctionalInterface
interface IntCalc {
    int calc(int a , int b);
}