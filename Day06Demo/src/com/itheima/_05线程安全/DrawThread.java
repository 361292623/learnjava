package com.itheima._05线程安全;
/*
* 线程类：创建取钱线程的。
* */
public class DrawThread extends Thread {

    // 接收取款的账户
    private Account acc ;
    // 接收取款的金额
    private double drawMoney;

    public DrawThread(String name , Account acc ,double drawMoney){
        super(name);
        this.acc = acc ;
        this.drawMoney = drawMoney;
    }

    @Override
    public void run() {
        // 取钱。
        acc.draw(drawMoney);
    }
}
