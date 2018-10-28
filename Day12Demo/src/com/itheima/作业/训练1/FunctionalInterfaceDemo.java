package com.itheima.作业.训练1;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        showLongTime(()->System.out.println(System.currentTimeMillis()));
    }

    static void showLongTime(CurrentTimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }
}

@FunctionalInterface
interface CurrentTimePrinter{
        void printCurrentTime();
}