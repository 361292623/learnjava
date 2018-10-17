package com.itheima._01多线程的创建方式一;
/*
* 线程创建方式一的第二种形式：
*    匿名内部类创建多线程。
*
* */
public class ThreadDemo02 {
    // 默认存在一个主线程：main方法。
    public static void main(String[] args) {
        // (1) 继承Thread类
        // 2.创建线程对象
        MyThread01 t1 = new MyThread01();
        t1.start();

        // 匿名内部类创建多线程。
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0 ; i < 5 ;i++ ) {
                    System.out.println(Thread.currentThread().getName()+"=>"+i);
                }
            }
        };
        t2.start();


        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}

// 1.定义一个线程类：创建线程对象
class MyThread01 extends Thread{
    @Override
    public void run() {
        // 线程的执行任务。
        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}