package com.itheima._04多线程的创建方式三;

import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
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
 *       优点：
 *          因为线程任务对象只是实现了Runnable接口，它依然可以继承其他类。
 *          同时也可以继续实现其他接口。（类是单继承，接口是多实现）
 *          线程任务的功能可以扩展的很强。
 *
 *          很适合做线程池。
 *          一个线程任务对象，可以被多个线程对象包装。
 *       缺点：
 *          编码相对较复杂。
 *          无法得到线程的执行结果。
 *
 *    （3）实现Callable接口：定义一个线程任务类实现Callable接口，
 *        然后重写线程任务类的call方法 ...
 *        缺点：
 *            编码复杂。
 *
 *        优点：
 *          因为线程任务对象只是实现了Callable接口，它依然可以继承其他类。
 *          同时也可以继续实现其他接口。（类是单继承，接口是多实现）
 *          线程任务的功能可以扩展的很强。
 *
 *          很适合做线程池。
 *          一个线程任务对象，可以被多个线程对象包装。
 *          可以得到线程的执行结果。
 *
 */
public class CallableDemo01 {
    public static void main(String[] args) {
        // 1.创建线程执行任务对象。
        Callable01 call = new Callable01();
        // 2.把call包装成一个Runnable对象
        //  把Call包装成了一个未来任务对象。
        //  这个未来任务对象其实就是一个Runnable对象
        // 未来任务对象：可以去获取线程执行的结果。
        FutureTask<String> task = new FutureTask<>(call);
        // 3.把未来任务对象（Runnable对象）包装成一个线程对象
        Thread t = new Thread(task);

        t.start();

        for(int i = 0 ; i < 5 ; i++ ) {
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }

        // 获取线程的执行结果：正常结果。异常结果。
        try {
            String rs  = task.get();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

// 泛型是线程任务最终执行的结果数据类型。
class Callable01 implements Callable<String>{
    @Override
    public String call() throws Exception {
        int count = 0 ;
        for(int i = 0 ; i < 5 ; i++ ) {
            count+=i;
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }
        return "线程求和的结果是："+count;
    }
}