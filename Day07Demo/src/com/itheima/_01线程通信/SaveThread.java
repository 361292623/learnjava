package com.itheima._01线程通信;
/*
* 存钱的线程：
*
* */
public class SaveThread extends Thread{
    // 接收存钱的账户和金额
    private Account acc ;
    private double saveMoney ;

    public SaveThread(String name , Account acc , double saveMoney){
        super(name) ; // 为当前线程取名字。
        this.acc = acc;
        this.saveMoney = saveMoney;
    }

    @Override
    public void run() {
        // 开始存钱。
        while(true){
            try{
                Thread.sleep(4000);
                acc.save(saveMoney);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
