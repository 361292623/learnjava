package com.itheima.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.taglibs.standard.tag.common.sql.DataSourceUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 数据源工具类
 */
public class DataSourceUtils {
    // 连接池对象
    private static DataSource ds = null;

    static {
      try{
          // 创建属性集合对象
          Properties info = new Properties();
          // 加载配置信息
          info.load(DataSourceUtil.class.getResourceAsStream("/druid.properties"));
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
            throw new RuntimeException("没有连接可用...稍等...");
        }
    }

    // 关闭资源方法
    public static  void  close(ResultSet rs, Statement stmt, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 关闭资源方法
    public static  void  close(Statement stmt,Connection conn){
        close(null, stmt, conn);
    }
}