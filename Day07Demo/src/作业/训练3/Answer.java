package 作业.训练3;

import java.util.Random;
import java.util.concurrent.*;

public class Answer {



        public static void main(String[] args){
            // 创建线程池对象
            ExecutorService threadPool = Executors.newFixedThreadPool(3);
            // 提交线程任务
            Future<Double> f1 = threadPool.submit(new AvgCallable());
            Future<Double> f2 = threadPool.submit(new AvgCallable());
            Future<Double> f3 = threadPool.submit(new AvgCallable());

            try {
                System.out.println(f1.get());
                System.out.println(f2.get());
                System.out.println(f3.get());


                double result = (f1.get() + f2.get() + f3.get()) / 3;
                // %d 整数
                // %s 字符串
                // System.out.println(result);
                System.out.println(String.format("三个数的平均数为：%.2f",result));

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            // 关闭线程池
            threadPool.shutdown();
        }
    }

    class AvgCallable implements Callable<Double> {

        @Override
        public Double call() throws Exception {
            // 生成10个1-100的随机数,然后计算他们的平均数,
            // 创建随机对象
            Random r = new Random();
            // 随机数个数
            int count = 10;
            // 声明变量累加随机数的和
            double sum = 0;
            // 循环生成10个随机数
            for (int i = 0; i < count; i++) {
                // 生成随机数
                sum += r.nextInt(100) + 1;
            }
            // 求平均数
            double avg = sum / count;
            System.out.println(Thread.currentThread().getName() + "生成的随机数平均值为：" + avg);
            return avg;
        }


}
