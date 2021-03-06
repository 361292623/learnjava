package com.itheima._11多线程;
/*
* 多线程：
*     进程：是正在运行中的程序就是进程。
*        -- 动态性
*           程序是静止的。
*           但是运行中的程序是动态的。
*           运行中的程序就是进程。
*           动态的去占用内存和CyiPU.
*
*        -- 并发性
*           假如一个电脑只有一个CPU,一个CPU是单核。
*           那么其实这个CPU每一个时刻只能处理一个进程，
*           CPU会分时轮询的一次去处理每个进程
*           因为轮询的速度很快，给用户的感觉好像这些进程
*           在同时运行，这就是并发。
*
*           并发：就是一堆进程在抢CPU.
*           其实每一个时刻只有一个进程在执行。
*
*           如果希望4个进程能够同时执行,需要4核CPU,称为4个进程在并行执行。
*
*        -- 独立性
*           每个进程占用自己独立的运行内存空间。
*           互相独立，互相不影响。
*     线程：
*          线程是属于进程的。
*          一个进程可以包含多个线程。这就是多线程。
*
*          线程也是可以执行程序的，线程也是并发的。
*
*          多线程提高了程序运行的效率
*          多线程能够解决很多业务问题。
*          多线程是Java中支持非常好的技术。
*          涉及到多线程的开发都会显得很难！！
*
*          注意：多线程的执行是随机的。因为他们是并发的。
*
*
* */
// ThreadDemo01 一启动就是进程了
public class ThreadDemo01 {
    // main方法其实就是一个线程，它是最牛逼的主线程。
    public static void main(String[] args) {
        // 创建一个线程
        MyThread t = new MyThread();
        t.start(); // 启动线程，自动执行run方法

        for (int i = 0 ; i < 5 ; i++ ){
            System.out.println("主线程："+i);
        }
    }
}

// 创建一个线程类：不是线程，是线程类，用来创建线程的、
class MyThread extends Thread{
    @Override
    public void run() {
        // 执行方法
        for (int i = 0 ; i < 5 ; i++ ){
            System.out.println("子线程："+i);
        }
    }
}
