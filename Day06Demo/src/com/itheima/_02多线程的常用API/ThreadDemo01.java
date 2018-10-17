package com.itheima._02多线程的常用API;
/*
* 多线程的常用API
*   （1）setName(String name) : 为当前线程取一个名字
*   （2） getName()：获取当前线程的名字
*   （3）Thread.currentThread()：获取当前线程对象。
*       这行代码在哪个线程中就会得到哪个线程对象。
*
*   线程是存在默认名字的：
*      主线程的默认名称就是 main
*      子线程的默认名称是：Thread-索引。
*/
// 进程： ThreadDemo01
public class ThreadDemo01 {
    // 默认存在一个主线程：main方法。
    public static void main(String[] args) {
        // (1) 继承Thread类
        // 2.创建线程对象
        MyThread t1 = new MyThread();
        t1.setName("1号线程");
        t1.start();
        //System.out.println(t1.getName());

        MyThread t2 = new MyThread();
        t2.setName("2号线程");
        t2.start();
        //System.out.println(t2.getName());

        // 为主线程取名字
        Thread t = Thread.currentThread();
        t.setName("最牛逼的线程");
        //System.out.println(t.getName());

        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(t.getName()+"=>"+i);
        }
    }
}

// 1.定义一个线程类：创建线程对象
class MyThread extends Thread{
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