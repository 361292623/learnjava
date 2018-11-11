package com.itheima._01反馈问题;

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
