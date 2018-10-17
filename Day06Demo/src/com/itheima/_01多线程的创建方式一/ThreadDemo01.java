package com.itheima._01多线程的创建方式一;
/*
* 多线程的创建：
*    多线程效率较高，可以实现很多的业务模型。
*
* 多线程的创建方式有几种?
*    有三种：
*    （1）继承Thread类：定义一个线程类继承Thread,重写线程的任务方法run方法，
*        创建线程类对象，调用线程类对象的start()方法启动线程。
*
*        优点：编码简单
*        缺点：全是缺点。
*           因为线程类已经继承了Thread,不能再继承其他类，线程类本身功能相对局限。
*           不能做线程池。
*           无法得到线程的执行结果。
*
*    （2）实现Runnable接口：定义一个线程任务类实现Runnable接口，
*       然后重写线程任务类的run方法，接着创建线程任务对象，
*       再把线程类任务对象包装成一个线程对象，然后调用线程对象的start()方法启动线程。
*
*    （3）实现Callable接口：定义一个线程任务类实现Callable接口，
*        然后重写线程任务类的call方法。...
*
*  多线程的运行原理？
*     线程是并发执行的，所以执行会出现随机性。
*
*
*/
// 进程： ThreadDemo01
public class ThreadDemo01 {
    // 默认存在一个主线程：main方法。
    public static void main(String[] args) {
        // (1) 继承Thread类
        // 2.创建线程对象
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println("main线程输出："+i);
        }
    }
}

// 1.定义一个线程类：创建线程对象
class MyThread extends Thread{
    @Override
    public void run() {
        // 线程的执行任务。
        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println("子线程输出："+i);
        }
    }
}