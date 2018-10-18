package com.itheima._03线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 线程池：（重要）
*   线程池：其实就是一个容纳多个线程的容器，
*          其中的线程可以反复使⽤，省去了了频繁创建线程对
           象的操作，⽆需反复创建线程⽽消耗过多资源

    频繁创建和销毁线程特别浪费资源。

    线程池中：长期保留一些固定不死亡的线程，可以反复的被利用。

    使⽤用线程池的好处：
      （1） 降低资源消耗。
      （2） 提⾼高响应速度。
      （3） 提⾼高线程的可管理理性。

    线程池的核心思想：线程复用。
    线程池默认是不会死亡的，它要被反复使用。

    如何做线程池按照线程任务对象分为:两种方式。
      （1）Runnable接口的方式做线程池。
      （2）Callable接口的方式创建线程池。

    线程池是什么类：
    如何创建线程池(容器)
    * 在JDK1.5之后,Java官方推出了一个类专门用来创建线程池，该类：Executors
    * 通过Executors类提供的静态方法就可以快速创建线程池对象，该方法如下：
        * public static ExecutorService newFixedThreadPool(int nThreads)
            * 创建线程池并指定线程数量

    ExecutorService接口概述
        * 只要是该接口的实现类对象就是一个线程池对象。

    ExecutorService接口常用方法
        * Future<?> submit(Runnable task); 提供Runnable任务
        * Future<T> submit(Callable<T> task); 提交Callable任务
        * void shutdown(); 销毁线程池,会等待线程池中的任务都执行完毕之后才销毁
        * List<Runnable> shutdownNow() 立即销毁线程池，如果线程池中的任务还没有开始执行，就不会被执行。

    线程池使用步骤：提交Runnable任务
        * 通过线程池工具类Executors的静态方法创建线程池对象
        * 创建一个类实现Runnable接口并重写run方法：线程任务相关的代码就写在该方法中
        * 调用线程池对象的submit方法提交任务：实现了Runnable接口的实现类对象
        * 调用线程池对象的shutdown方法销毁线程池。
*
*/
public class ThreadPools {
    public static void main(String[] args) {
        // 创建一个线程池：ExecutorService 。
        // 通过 Executors调用自己的静态方法：newFixedThreadPool 创建一个容量为3的线程池。
        // 这个线程池最多只保留3个常用线程。
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // 创建三个线程交给线程池
        // 创建一个线程任务对象。
        Runtime01 t1 = new Runtime01();

        // submit：把线程任务交给线程池，线程池会自动创建线程，
        // 并且自动启动。
        pools.submit(t1);
        pools.submit(t1);
        pools.submit(t1);

        // 再加入一个线程任务，不会创建新的线程了，因为线程池已经满了。
        // 会重复利用之前的线程。
        pools.submit(t1);
        pools.submit(t1);

    }
}

class Runtime01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 3 ; i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}
