package com.itheima._02死锁;
/*
* 死锁：
*    线程间进入互相等待，无法接触这个僵局就进入了死锁。
*    死锁是应该避免的。
*    死锁一旦出现，没有办法只能重启。
*    或者有一种方式是把对方需要的资源释放出去。
* */
public class ThreadDead01 {
    public static Object obj = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
               while(true){
                   synchronized (obj){
                       System.out.println( Thread.currentThread().getName()
                               +"进入等待状态");
                       try {

                           obj.wait(); // 暂停了自己，释放了锁。
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
               }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println( Thread.currentThread().getName()
                            +"唤醒状态");
                    try {
                        obj.notify(); // 唤醒了一次。
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
