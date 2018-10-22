package 作业.训练3;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    public static void main(String[] args) {

        FutureTask<Double> ftesk1 = new FutureTask<>(new Caller());
        FutureTask<Double> ftesk2 = new FutureTask<>(new Caller());
        FutureTask<Double> ftesk3 = new FutureTask<>(new Caller());
        Thread t1 = new Thread(ftesk1);
        Thread t2 = new Thread(ftesk2);
        Thread t3 = new Thread(ftesk3);
        t1.start();
        t2.start();
        t3.start();
        try {
            System.out.println(ftesk1.get());
            System.out.println(ftesk2.get());
            System.out.println(ftesk3.get());
            double  d=(ftesk1.get()+ftesk2.get()+ftesk3.get())/3;
            System.out.println("平均数"+d);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class Caller implements Callable{
    Random random =new Random();
    private int sum = 0;

    @Override
    public Double  call() throws Exception {

            for (int i = 1; i <= 10; i++) {
                sum += random.nextInt(99) + 1;
            }


            System.out.println("---" + sum + "---" + Thread.currentThread().getName());
            double avg = sum * 1.0 / 10;
            return avg;

        }

}