package com.itheima._02多线程的常用API;
/*
* 构造器取线程名字。
*/
public class ThreadDemo02 {
    // 默认存在一个主线程：main方法。
    public static void main(String[] args) {
        // (1) 继承Thread类
        // 2.创建线程对象
        MyThread01 t1 = new MyThread01("1号线程");
        t1.start();

        MyThread01 t2 = new MyThread01("2号线程");
        t2.start();

        // 为主线程取名字

        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}

// 1.定义一个线程类：创建线程对象
class MyThread01 extends Thread{

    public MyThread01(String name){
        // 把线程的名字送给父类的有参数构造器。
        super(name);
    }

    @Override
    public void run() {
        // 获取当前子线程
        // Thread t = Thread.currentThread();
        // 线程的执行任务。
        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}