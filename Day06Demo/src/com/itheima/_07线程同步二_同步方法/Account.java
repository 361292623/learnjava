package com.itheima._07线程同步二_同步方法;
/*
*  账户。
*     卡号
*     余额
*
* */
public class Account {
    private String cardId ;
    private double money ;

    // 小明
    // 小红
    public synchronized void draw(double drawMoney) {
        // 先获取取钱的人。
        String name = Thread.currentThread().getName();
        if(this.money >= drawMoney){
            // 余额足够开始取钱
            System.out.println(name+"来取钱，吐出"+drawMoney);
            // 更新余额
            this.money -= drawMoney;
            System.out.println(name+"取钱后，剩余"+this.money);

        }else{
            System.out.println(name+"来取钱，余额不足！");
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
