package 作业.训练4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*使用线程池：一个线程计算10! ，一个线程计算5!，
        一个线程计算8! 打印在那个线程执行的和执行结果.(使用 Runnable)*/
public class Test4 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

       pool.submit(new runner(10) );
       pool.submit(new runner(8) );
       pool.submit(new runner(7) );
       pool.submit(new runner(12) );
       pool.submit(new runner(9) );


    }
}

class runner implements Runnable {
    private int n;
    private int sum=1;

    public runner() {
    }

    public runner(int n) {

        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1 ; i<=n ;i++){
            sum = i*sum;

        }
        System.out.println("线程："+Thread.currentThread().getName()+"执行结果是："+sum);
    }
}