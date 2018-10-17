package com.itheima._01多线程的创建方式一;
/*
* 多线程的注意事项：
*    一般需要把多线程的创建放在main方法任务的前面。
*
*    如果直接调用run，实际上被当成一个普通类的普通方法来执行。
     线程对象将失去线程特征，线程的启动必须调用start();
* */
public class ThreadDemo03 {
    // 默认存在一个主线程：main方法。
    public static void main(String[] args) {
        // (1) 继承Thread类
        // 2.创建线程对象
        MyThread02 t1 = new MyThread02();
        t1.start();
        // 如果直接调用run，实际上被当成一个普通类的普通方法来执行。
        // 线程对象将失去线程特征，线程的启动必须调用start();
        //t1.run();


        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }

    }
}

// 1.定义一个线程类：创建线程对象
class MyThread02 extends Thread{
    @Override
    public void run() {
        // 线程的执行任务。
        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }
    }
}
