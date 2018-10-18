package com.itheima._04Lambda表达式;

import javax.print.attribute.standard.RequestingUserName;

/*
* Runnable接口的Lambda简化形式。
*
* 函数式接口可以加上@FunctionalInterface注解：接口中只有一个抽象方法。
* 此时这个接口就必须是函数式接口
*
* */
public class LambdaDemo02 {
    public static void main(String[] args) {
      /*  Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 3 ; i++ ) {
                    System.out.println(Thread.currentThread().getName()+"=>"+i);
                }
            }
        };*/


        // 简化规则:因为方法只有一个，所以底层很清楚这个代码是为哪个方法重写的。
        Runnable target = () -> {
            for (int i = 0 ; i < 3 ; i++ ) {
                System.out.println(Thread.currentThread().getName()+"=>"+i);
            }
        };

        Thread t = new Thread(target);
        t.start();
    }
}
