package com.itheima._04函数式接口作为方法的返回值以及简化;
/*
* 函数式接口作为方法的返回值以及简化
*
*
* */
public class FunctionalInterfaceDemo01 {
    public static void main(String[] args) {
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();*/

        Thread t = new Thread(getTask());
        t.start();
    }

    /*
    * 获取一个线程任务对象。
    *
    * */
    public static Runnable getTask(){
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        return r ;*/

       /* return new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };*/

       /* return () -> {
             System.out.println(Thread.currentThread().getName());
        };*/

        return () ->  System.out.println(Thread.currentThread().getName()) ;

    }


}
