package com.itheima._03线程池;

import java.util.concurrent.*;
// 需求：计算 1-n 的和。
public class ExecDemo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建一个线程池：ExecutorService 。
        // 通过 Executors调用自己的静态方法：newFixedThreadPool 创建一个容量为3的线程池。
        // 这个线程池最多只保留3个常用线程。
        ExecutorService pools = Executors.newFixedThreadPool(3);

        // 任务需要每次都创建新的对象，代表新任务，否则出现业务问题。
        Future<String> t1 = pools.submit(new Callable02(100));
        Future<String> t2 = pools.submit(new Callable02(200));
        Future<String> t3 = pools.submit(new Callable02(300));
        Future<String> t4 = pools.submit(new Callable02(400));

        String rs1 = t1.get();
        String rs2 = t2.get();
        String rs3= t3.get();
        String rs4= t4.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
        System.out.println(rs4);



    }
}
class Callable02 implements Callable<String> {

    private int n ;
    public Callable02(){

    }
    public Callable02(int n){
        this.n = n ;
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int count = 0 ;
        for (int i = 1 ; i <= n ; i++ ) {
            count+=i;
            //System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
        return Thread.currentThread().getName()+"求和结果是："+count;
    }
}