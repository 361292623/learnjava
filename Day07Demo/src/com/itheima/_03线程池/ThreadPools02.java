package com.itheima._03线程池;

import java.util.concurrent.*;

/*
* Callable做线程池：
*  得到线程执行的结果。
*
* */
public class ThreadPools02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建一个线程池：ExecutorService 。
        // 通过 Executors调用自己的静态方法：newFixedThreadPool 创建一个容量为3的线程池。
        // 这个线程池最多只保留3个常用线程。
        ExecutorService pools = Executors.newFixedThreadPool(3);

        Callable01 call = new Callable01();
        // 把Callable任务对象交给线程池，线程池会自定创建线程和未来任务对象返回给你取拿线程执行的结果。
        Future<String> t1 = pools.submit(call);
        Future<String> t2 = pools.submit(call);
        Future<String> t3 = pools.submit(call);

        // 是重复使用之前的三个线程中的某一个。
        Future<String> t4 = pools.submit(call);

        String rs1 = t1.get();
        String rs2 = t2.get();
        String rs3= t3.get();
        String rs4= t4.get();
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
        System.out.println(rs4);

        /* * void shutdown(); 销毁线程池,会等待线程池中的任务都执行完毕之后才销毁
         * List<Runnable> shutdownNow() 立即销毁线程池，
             无论线程池是否执行完毕。
*/
        pools.shutdown(); // 会等待线程池中的任务都执行完毕之后才销毁
        //pools.shutdownNow(); //立即干掉线程池。无论线程池是否执行完毕。

    }
}
class Callable01 implements Callable<String>{

    @Override
    public String call() throws Exception {
        int count = 0 ;
        for (int i = 0 ; i < 3 ; i++ ) {
            count+=i;
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
        return Thread.currentThread().getName()+"求和结果是："+count;
    }
}