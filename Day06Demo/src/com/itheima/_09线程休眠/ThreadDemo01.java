package com.itheima._09线程休眠;

public class ThreadDemo01 {
    // 默认存在一个主线程：main方法。
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+"=>"+i);
            try {
                // 线程进入休眠
                // 在哪个线程中哪个线程就会休眠
                /*
                * 项目经理让我加上这行代码
                * 如果用户交钱了，我就注释掉。
                *
                */
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

