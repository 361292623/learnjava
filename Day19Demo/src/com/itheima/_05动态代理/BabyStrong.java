package com.itheima._05动态代理;

/**
    宝强类实现明星接口，重写接口中的方法
 */
public class BabyStrong  implements Star{

    @Override
    public void sing(String name) {
        System.out.println("宝强唱：" + name);
    }

    @Override
    public String dance() {
        System.out.println("宝强跳钢管舞...");
        return "xxx";
    }
}
