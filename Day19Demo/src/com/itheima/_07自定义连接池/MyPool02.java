package com.itheima._07自定义连接池;

import com.itheima._02SQL注入.JDBCUtil;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
  使用动态代理解决close关闭连接的问题：不是真正关闭，而是放回集合中
 */
// 自定义连接池类
public class MyPool02 implements DataSource{
    // 最大连接数
    private int maxCount = 10;
    // 初始连接数
    private int initCount = 5;

    // 当前连接数
    private int currentCount = 0;

    // 集合：存储连接对象
    private LinkedList<Connection> list = new LinkedList<>();

    public MyPool02(){
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
        // 获得连接对象(真实对象)
        // ConnectionImpl implements Connection
        Connection conn = JDBCUtil.getConnection();
        // 创建代理对象：代理连接对象
        Connection proxy = (Connection)Proxy.newProxyInstance(
                Connection.class.getClassLoader(),
                new Class[]{Connection.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 判断method是否是close方法
                        if(method.getName().equals("close")){
                            System.out.println("close方法被拦截到了");
                            // 将代理对象放回集合中
                            list.addLast((Connection) proxy);
                        }
                        // 调用真实连接对象的方法
                        return method.invoke(conn,args);
                    }
                });

        // 连接数加一
        currentCount++;
        // 返回代理对象
        return proxy;
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
