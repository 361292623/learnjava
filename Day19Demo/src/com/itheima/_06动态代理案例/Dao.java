package com.itheima._06动态代理案例;

public interface Dao<T>{
    // 增
    public void save(T t);
    // 删
    public void delete(int id);
    // 改
    public void update(T t);
    // 查
    public T find(int id);
}
