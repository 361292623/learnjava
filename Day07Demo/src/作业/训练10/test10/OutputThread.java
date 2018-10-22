package 作业.训练10.test10;

public class OutputThread implements Runnable {
    private Person p;
    public OutputThread(Person p) {

        this.p = p;
    }
    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (p) {
                try {
                    if(p.flag) {
                        // 输出内容
                        System.out.println(Thread.currentThread().getName() + p);
                        // 设置标记为false
                        p.flag = false;
                        // 唤醒输入线程
                        p.notify();
                    }
                    // 进入等待状态
                    p.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
