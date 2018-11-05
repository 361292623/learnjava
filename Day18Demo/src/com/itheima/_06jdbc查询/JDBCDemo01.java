package com.itheima._06jdbc查询;

import java.sql.*;

/**
    JDBC之查询操作：查询所有学生

     1. ResultSet对象的作用
        * 结果集对象：用来封装满足查询条件的记录信息

     2. 如何获得ResultSet对象
        * 通过Statement接口的方法获得，该方法声明如下
            * ResultSet executeQuery(String sql)
                * 执行查询语句并获得查询结果

     3. ResultSet接口常用方法
        * boolean next(); 将指针下移一行并判断当前位置是否有记录，有返回true，否则false
        * Xxx getXxx(列号或列名); 根据列号或列名获得对应列的数据. 如果是列号默认从1开始

     4. 查询注意事项
        * 当指针指向第一行记录前面时调用getXxx方法获得数据就会抛出如下异常信息
            * java.sql.SQLException: Before start of result set。
        * 当指针指向最后一行记录后面时调用getXxx方法获得数据就会抛出如下异常信息
            *  java.sql.SQLException: After end of result set

     在JDK1.5之后，注册驱动的代码可以省略了，推荐保留。
 */
public class JDBCDemo01 {
    public static void main(String[] args) throws SQLException {
        // 在JDK1.5之后，注册驱动的代码可以省略了，推荐保留。
        // 获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "select * from student;";
        // 执行查询操作
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()){
            // 根据列号获得每一列的值
            /*int id = rs.getInt(1);
            String name = rs.getString(2);
            String gender = rs.getString(3);
            String birthday = rs.getString(4);*/

            // 根据列名获得每一列的值
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            Date birthday = rs.getDate("birthday");
//            String birthday = rs.getString("birthday");
            System.out.println(id+"="+name+"="+gender+"="+birthday);
        }

        // 关闭资源
        rs.close();
        stmt.close();
        conn.close();;
    }
}
