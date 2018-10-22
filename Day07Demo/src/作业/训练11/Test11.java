package 作业.训练11;

public class Test11 {
    public static void main(String[] args) {

        System.out.println(DoubleColorBallUtil.create());
        tongji t = new tongji();
        IntoRunner intoRunner = new IntoRunner(t);

        Thread thread1 = new Thread(intoRunner,"前门");
        Thread thread2 = new Thread(intoRunner,"后门");
        thread1.start();
        thread2.start();

    }

}

class IntoRunner implements Runnable{
private tongji t1;

    public IntoRunner(tongji t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        t1.tt();
    }
}

class tongji {
    private  int qianCount = 0;
    private  int houCount = 0;
    private  int num=1;

    public void tt(){

        while (true){
        synchronized (this.getClass()){

            String threadName = Thread.currentThread().getName();
            if(houCount+qianCount==50){
                break;
            }
            if(threadName.equals("前门")){
                System.out.println("编号："+num+"的员工从"+threadName+"入场"
                        +"拿到彩票："+DoubleColorBallUtil.create());
                num++;
                qianCount++;
                System.out.println("qianCount"+qianCount);

            }else if(threadName.equals("后门")){
                System.out.println("编号："+num+"的员工从"+threadName+"入场"
                        +"拿到彩票："+DoubleColorBallUtil.create());
                num++;
                houCount++;
                System.out.println("houCount"+houCount);
            }




        }


    }}

}