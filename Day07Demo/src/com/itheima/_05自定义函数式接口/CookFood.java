package com.itheima._05自定义函数式接口;
@FunctionalInterface // 函数式接口注解：有且仅有一个抽象方法，安全 专业
public interface CookFood {
    void cook(String name);
}
