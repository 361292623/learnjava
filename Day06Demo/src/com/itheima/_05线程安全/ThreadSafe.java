package com.itheima._05线程安全;
/*
 * 线程安全问题：
 *    多个线程在操作同一个资源的时候可能会出现线程安全问题。
 *    线程安全问题：必须避免。
 *
 *    解决线程安全问题的核心：
 *       让多个线程实现依次先后来操作共享资源。
 *       也就是共享资源永远只能有一个人线程操作它，不能同时操作就完全
 *       可以解决线程安全问题。
 *
 *   1.模拟线程安全问题。
 *     使用面向对象的思想来模拟转账安全问题。
 *     账户一开始是1万
 *     小明 小红 同时去账户中取款1万。
 *
 *   2.解决线程安全问题。
 *      线程同步：让出现线程安全问题的代码区（临界区）锁起来。
 *              每次只能有一个线程执行完毕后，其他线程才可以进来。
 *
 *      线程同步是为了解决线程安全问题。
 *
 *      线程同步的方式有三种：
 *         （1）同步代码块：
 *               就是把出现线程安全的代码块给锁起来，
 *               每次只能一个线程执行，其他线程必须等待。
 *
 *         （2）同步方法：就是把出现线程安全问题的方法给锁起来，
 *                     每次只能一个线程执行，其他线程必须等待。
 *
 *         （3）自定义锁
 *
 *
 *
 */
public class ThreadSafe {
    public static void main(String[] args) {
        // 创建一个共享资源：账户。
        Account acc = new Account("110",10000);
        // 创建 小明线程。
        DrawThread xiaoMing = new DrawThread("小明",acc,10000);
        xiaoMing.start();

        // 创建 小红线程。
        DrawThread xiaoRed = new DrawThread("小红",acc,10000);
        xiaoRed.start();

    }
}
