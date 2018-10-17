package com.itheima._08方法重写异常处理注意点;

public class People {
    // 规范，底层异常往外扔！
    public void run() throws Exception{
        System.out.println("人可能跑!");
    }
}
