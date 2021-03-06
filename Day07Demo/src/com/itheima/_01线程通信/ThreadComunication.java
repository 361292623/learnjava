package com.itheima._01线程通信;
/*
* 线程通信：
*      多个线程互相之间通过通信来实现线程的等待与唤醒。
*      线程通信也是针对于多个线程操作同一个资源。
*      线程通信首先要保证线程安全。
*
*      线程通信的经典模型：生产者消费者模型。
*      生产者线程负责生产资源，消费者线程负责消费资源。
*      通常的模型是：生产不能过剩，消费不能没有。
*
*      等待唤醒机制：为了实现线程的可控制执行。
*         生产者如果生产了商品，生产者必须等待自己，
*         然后唤醒消费者消费，消费者消费完了数据以后
*         消费者应该等待自己，唤醒生产者继续生产。
*
*      生产者：可以有多个。
*      消费者：可以有多个。
*
*      需求：小明 和 小红 有一个账户。
*           亲爸 ，干爸 ，老王。
*           生产者：三个爸爸给他们的账户存入10000
*           消费者：小明 小红 去取钱 10000
*           通常的模型是：生产不能过剩，消费不能没有。
*
*    wait() ：等待，将当前正在执行的线程做成等待状态，等待被唤醒。
     notify()：唤醒，唤醒线程池中被wait()的线程，⼀次只能唤醒⼀个，⽽且是任意的。
     notifyAll()： 唤醒全部，可以将线程池中的所有wait() 线程都唤醒
*
*
 */
public class ThreadComunication {
    public static void main(String[] args) {
        // 创建一个共享资源
        Account acc = new Account("111",0);
        // 消费者： 小明 小红
        new DrawThread("小明",acc,10000).start();
        new DrawThread("小红",acc,10000).start();

        // 生产者： 亲爸 干爸 老王
        new SaveThread("亲爸",acc,10000).start();
        new SaveThread("干爸",acc,10000).start();
        new SaveThread("老王",acc,10000).start();

    }
}
