package com.itheima._06动态代理案例;

/**
  数据访问层：直接对数据库执行增删改查操作
 */
public class ProductDao implements Dao<Product> {
    @Override
    public void save(Product product) {
        System.out.println("保存产品信息");
    }

    @Override
    public void delete(int id) {
        System.out.println("删除产品信息");
    }

    @Override
    public void update(Product product) {
        System.out.println("更新产品信息");
    }

    @Override
    public Product find(int id) {
        System.out.println("查询产品信息");
        return null;
    }
}
