package com.itheima._03多线程的创建方式二;
/*
* * 多线程的创建方式有几种?
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
 *
 */
public class RunnableDemo01 {
    public static void main(String[] args) {
        //1.创建线程任务对象
        // 注意：线程任务对象，并不是线程类。
        Runnable01 target = new Runnable01();

        // 2.再把线程类任务对象包装成一个线程对象
        // Thread(Runnable target)
        // Thread t = new Thread(target);
        // t.setName("1号线程");

        // Thread(Runnable target, String name)
        Thread t1 = new Thread(target,"1号线程");
        t1.start();

        Thread t2 = new Thread(target,"2号线程");
        t2.start();

        for(int i = 0 ; i < 5 ; i++ ) {
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }
    }
}

// 线程任务类：创建线程任务对象的。
class Runnable01  implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }
    }
}
