package com.itheima._07自定义连接池;

import com.itheima._02SQL注入.JDBCUtil;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
    自定义连接池
     1、什么是连接池
        * 一个用来创建和管理连接对象的容器(数组和集合)

     2、为什么要使用连接池
        * 因为频繁创建和销毁连接对象很消耗资源：内存资源和时间。使用连接池就可以让连接对象
            使用完毕之后不立即销毁，而是放在容器中等待下一次使用。

     3、连接池的核心思想
        * 连接复用
 */
// 自定义连接池类
public class MyPool01 implements DataSource{
    // 最大连接数
    private int maxCount = 10;
    // 初始连接数
    private int initCount = 5;

    // 当前连接数
    private int currentCount = 0;

    // 集合：存储连接对象
    private LinkedList<Connection> list = new LinkedList<>();

    public MyPool01(){
        // 一开始创建5个连接对象在集合中存储
        for (int i = 0; i < initCount; i++) {
            // 创建连接对象
            Connection conn = createConnection();

            // 将连接对象添加集合中
            list.add(conn);
        }
    }

    // 创建连接对象
    public Connection createConnection(){
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 连接数加一
        currentCount++;
        // 返回连接对象
        return conn;
    }

    // 返回连接对象
    @Override
    public Connection getConnection() throws SQLException {
        // 判断是否还有连接对象可用
        if(list.size() > 0) {
            // 获得一个连接对象返回
            return list.removeFirst();
        }
        // 判断连接对象数量是否已经达到最大数量
        if (currentCount < maxCount ) {
            // 没有达到最大数量，创建一个连接对象返回
            Connection conn = createConnection();
            return conn;
        }
        // 没有连接对象可用
        throw new RuntimeException("暂无连接对象可用,稍安勿躁...");
    }

    // 将连接对象放回集合中
    public void close(Connection conn){
        list.addLast(conn);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
