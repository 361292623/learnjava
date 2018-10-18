package com.itheima._01线程通信;
/*
* 消费者：取钱线程类。
*   取钱。
*
* */
public class DrawThread extends Thread{
    // 接收取钱的账户和金额
    private Account acc ;
    private double drawMoney ;

    public DrawThread(String name , Account acc , double drawMoney){
        super(name) ; // 为当前线程取名字。
        this.acc = acc;
        this.drawMoney = drawMoney;
    }

    @Override
    public void run() {
        // 开始取钱。
        while(true){
            try{
                Thread.sleep(4000);
                acc.draw(drawMoney);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
