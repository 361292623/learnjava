package com.registerdemo.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
 * 数据源工具类
 */
public class DataSourceUtil {
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

    // 重构代码的思想：将重复出现的代码抽取到一个方法中，不同的内容作为参数传递
    public static int update(String sql,Object...params){
        try{
            // 获得连接对象
            Connection conn = DataSourceUtil.getConnection();
            // 获得预编译对象
            PreparedStatement ps = conn.prepareStatement(sql);

            // 获得参数元数据对象
            ParameterMetaData pmd = ps.getParameterMetaData();
            // 获得占位符的数量
            int count = pmd.getParameterCount();

            for (int index = 0; index < count; index++) {
                // 设置占位符数据
                ps.setObject(index+1, params[index]);
            }
            // 执行SQL
            int row = ps.executeUpdate();
            // 关闭资源
            DataSourceUtil.close(ps,conn);
            return row;
        } catch(Exception e){
            return 0;
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