package com.itheima.作业.训练5;

public class Test5 {
    public static void main(String[] args) {
// 使用方法引用补全Son类中横线处的代码，帮助Father打酱油。
        Son son = new Son();
        son.daJiangYou();


    }
}


@FunctionalInterface
 interface Helper {
    void help();
}

 class Father {
    public void askMoney(){
        System.out.println("向家中的财政老大要钱购买家庭物资...");
    }
    public void spendMoney(){
        System.out.println("去村口小卖部付钱给老板打酱油...");
    }
}


 class Son extends Father {
     @Override
     public void askMoney() {
         System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
     }
         @Override
    public void spendMoney() {
        System.out.println("去网吧付钱给网管开了一台机器...");
    }
    public void helpFather(Helper helper) {
        helper.help();
    }
    //完成帮助Father打酱油的方法
    public void daJiangYou() {
        helpFather(super::askMoney);
        helpFather(super::spendMoney);
    }
}
