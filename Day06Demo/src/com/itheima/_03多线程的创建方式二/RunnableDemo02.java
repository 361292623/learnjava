package com.itheima._03多线程的创建方式二;
/*
* 匿名内部类创建一个Runnable接口对象
* */
public class RunnableDemo02 {
    public static void main(String[] args) {

        // 匿名内部类创建一个Runnable接口对象
        // 线程任务对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 5 ; i++ ) {
                    System.out.println(Thread.currentThread().getName()+"#"+i);
                }
            }
        };

        // 把线程任务对象包装成线程对象
       /* Thread t = new Thread(target);
        t.start();*/
        new Thread(target).start();


        for(int i = 0 ; i < 5 ; i++ ) {
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }
    }
}
