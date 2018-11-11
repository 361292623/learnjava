package com.itheima._06动态代理案例;

/**
    数据访问层：对数据执行增删改查

    三层架构
        表现层(View)：直接跟用户打交道，展示数据给用户看或接收用户输入的数据。
        业务逻辑层(Service)：处理业务逻辑，比如登录，转账
        数据访问层(Dao)：直接跟数据库打交道，对数据库执行增删改查
 */
public class StudentDao implements Dao<Student> {
    @Override
    public void save(Student student) {
        System.out.println("保存学生信息");
    }

    @Override
    public void delete(int id) {
        System.out.println("删除学生信息");
    }

    @Override
    public void update(Student student) {
        System.out.println("更新学生信息");
    }

    @Override
    public Student find(int id) {
        System.out.println("查询学生信息");
        return null;
    }

    // 检查是否有权限
    public boolean check(){
        System.out.println("检查权限....");
        return true;
    }



}
