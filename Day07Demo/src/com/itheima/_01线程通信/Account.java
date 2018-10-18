package com.itheima._01线程通信;
/*
*  账户。
*     卡号
*     余额
*
* */
public class Account extends Object {
    private String cardId ;
    private double money ;

    // 存钱：三个人来存钱
    // 亲爸 老王 干爸
    public synchronized void save(double saveMoney) {
        try{
            // 1.是谁进来取钱。
            String name = Thread.currentThread().getName();
            // 2.判断账户是否有钱，有钱无需存钱
            if(this.money > 0){
                // 有钱，等待自己唤醒别人
                this.notifyAll();
                this.wait();
            }else{
                // 没钱了，需要存钱
                this.money += saveMoney ;
                System.out.println(name+"来存钱："+saveMoney+"余额："+this.money);

                // 有钱，等待自己唤醒别人
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 取钱的方法。
    // 小明
    // 小红
    public synchronized void draw(double drawMoney) {
       try{
           // 1.是谁进来取钱。
           String name = Thread.currentThread().getName();
           // 2.判断余额是否足够
           if(this.money >= drawMoney){
               // 更新余额
               this.money -= drawMoney;
               // 输出日志 :吐出钱
               System.out.println("["+name+"] -> 来取钱成功！取出"+drawMoney+",剩余"+this.money);

               // 线程通信：等待自己，唤醒别人。
               // 唤醒所有线程。
               // 等待唤醒的方法应该用锁对象来调用：用共享资源调用。
               this.notifyAll();
               // 等待自己
               this.wait();

           }else{
               // 余额不足。
               this.notifyAll();
               // 等待自己
               this.wait();
           }
       }catch (Exception e){
           e.printStackTrace();
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
