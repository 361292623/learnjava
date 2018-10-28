package com.itheima.作业.训练8;

public class Test8 {
    public static void main(String[] args) {
        getIntegerArray(8, Integer[]::new);
    }

    static void getIntegerArray(int length , ArrayBuilder builder){
        System.out.println(builder.buildArray(length));
    }
}


@FunctionalInterface
interface ArrayBuilder<T>{
    T[] buildArray(int length);
}