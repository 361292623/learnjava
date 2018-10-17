package com.itheima._08线程同步三_显示创建锁;

import java.util.concurrent.locks.ReentrantLock;

/*
*  账户。
*     卡号
*     余额
*
* */
public class Account {
    private String cardId ;
    private double money ;
    // 创建一把锁: final:锁唯一，而且不可改变。
    private final ReentrantLock lock = new ReentrantLock();

    // 小明
    // 小红
    public void draw(double drawMoney) {
        // 先获取取钱的人。
        String name = Thread.currentThread().getName();
        lock.lock(); // 上锁
        try{
            if(this.money >= drawMoney){
                // 余额足够开始取钱
                System.out.println(name+"来取钱，吐出"+drawMoney);
                // 更新余额
                this.money -= drawMoney;
                System.out.println(name+"取钱后，剩余"+this.money);

            }else{
                System.out.println(name+"来取钱，余额不足！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public Account() {

    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
