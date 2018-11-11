package com.itheima._10数据源工具类;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima._09druid连接池.DruidDemo01;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
    数据源工具类
 */
public class DataSourceUtil {

    // 连接池对象
    private static DataSource ds = null;

    // 静态代码块
    static {
        try{
            // 创建属性集合
            Properties info = new Properties();
            // 加载配置信息
            info.load(DruidDemo01.class.getResourceAsStream("/druid.properties"));
            // 创建连接池对象
            ds = DruidDataSourceFactory.createDataSource(info);
        } catch(Exception e){

        }
    }

    // 返回数据源对象
    public static DataSource getDataSource(){
        return ds;
    }

    // 返回连接对象
    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }

    // 关闭资源
    public static void close(Statement stmt, Connection conn){
        close(null, stmt, conn);
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn){
        try {
            // 关闭资源
            if ( rs!= null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            // 关闭资源
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            // 关闭资源
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
