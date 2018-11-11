package com.itheima._03预编译对象;

import com.itheima._02SQL注入.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
    使用PreparedStatement对象执行增删改操作
 */
public class PreparedStatementDemo01 {
    // 添加数据: 向学生表添加3条记录
    @Test
    public void insertStudent() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 准备SQL语句
        String sql = "insert into student values(null,?,?,?);";
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);

        // 给占位符赋值
        ps.setString(1, "张三");
        ps.setString(2, "男");
        ps.setString(3, "1999-10-20");

        // 执行SQL语句
        int row = ps.executeUpdate();
        System.out.println("row = " + row);

        // 给占位符赋值
        ps.setString(1, "李四");
        ps.setString(2, "女");
        ps.setString(3, "2009-10-20");
        // 执行SQL语句
        row = ps.executeUpdate();
        System.out.println("row = " + row);


        // 给占位符赋值
        ps.setString(1, "王五");
        ps.setString(2, "男");
        ps.setString(3, "1998-02-20");
        // 执行SQL语句
        row = ps.executeUpdate();
        System.out.println("row = " + row);

        // 关闭资源
        JDBCUtil.close(ps,conn);
    }

    // 修改数据: 将 id 为 2的用户，姓名更新为 "嫦娥 "  性别换成女，
    @Test
    public void updateStudent() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 准备SQL语句
        String sql = "update student set name = ?, gender = ? where id = ?;";
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);

        // 给占位符赋值
        ps.setString(1, "猪八戒");
        ps.setString(2, "男");
        ps.setInt(3, 6);

        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);

        // 关闭资源
        JDBCUtil.close(ps,conn);
    }

    // 删除数据: 删除id为6的学生
    @Test
    public void deleteStudent() throws Exception {
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 准备SQL语句
        String sql = "delete from student where id = ?;";
        // 获得预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);

        // 给占位符赋值
        ps.setInt(1, 6);

        // 执行SQL
        int row = ps.executeUpdate();
        System.out.println(row);

        // 关闭资源
        JDBCUtil.close(ps,conn);
    }
}
