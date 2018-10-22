package com.itheima._01作业练习题;
/*
 * 啤酒问题：
 *    啤酒2元一瓶，2个空瓶可以换一瓶，4个盖子可以换一瓶
 *    请问10元可以喝多少瓶？
 *
 *
 */
public class PiJiuDemo01 {

    // 静态变量：属于类的，只有一份。
    // 定义三个静态变量依次存放用户可以喝的酒的总数量，
    // 还有剩余的盖子数量和瓶子数量
    private static int totalCount ;
    private static int lastGaiZiNums ;
    private static int lastPingZiNums ;


    public static void main(String[] args) {
        calc(2);
        System.out.println("总数："+totalCount);
        System.out.println("剩余瓶子："+lastPingZiNums);
        System.out.println("剩余盖子："+lastGaiZiNums);
    }

    // (1)创建一个方法用于计算用户可以喝的总的酒数量。
    public static void calc(int money){
        // 拿钱买酒
        int buyNums = money / 2 ;
        totalCount += buyNums;
        // 多出一些空瓶和盖子。 5 / 5
        // 计算出当前剩余的总的盖子数量和瓶子数量：当前多出的盖子数量和瓶子数量
        // 加上上一轮多出来的盖子数量和瓶子数量
        int cPingZiNums = buyNums + lastPingZiNums;
        int cGaiZinums = buyNums + lastGaiZiNums;

        // 把瓶子和盖子换算成钱。
        // 定义一个变量计算此轮换算成钱的总金额
        int totalMoney = 0 ;
        if(cPingZiNums >= 2){
            totalMoney += ( cPingZiNums /2 ) * 2;
        }
        // 计算出没有换完的瓶子作为下一轮的瓶子。
        lastPingZiNums = cPingZiNums % 2 ;

        if(cGaiZinums >=4){
            totalMoney += (cGaiZinums / 4) * 2;
        }
        lastGaiZiNums = cGaiZinums % 4 ;

        if(totalMoney >=2){
            calc(totalMoney);
        }

    }
}
