package com.itheima._02SQL注入;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
    存在SQL注入问题
 */
public class LoginDemo01 {
    public static void main(String[] args) throws SQLException {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 提示用户输入用户名
        System.out.println("请输入账号：");
        // 接收用户名
        String username = sc.nextLine();
        // 提示用户输入密码
        System.out.println("请输入密码：");
        // 接收密码
        String password = sc.nextLine();
        // 获得连接对象
        Connection conn = JDBCUtil.getConnection();
        // 获得发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "select * from user where username='"+username+"' and password = '"+password+"';";
        System.out.println("sql = " + sql);
        // 执行查询操作并获得结果集对象
        ResultSet rs = stmt.executeQuery(sql);
        // 根据结果集对象判断是否登录成功
        if (rs.next()){
            // 进来这里说明用户名和密码正确
            System.out.println("欢迎"+username+"回来");
        } else {
            System.out.println("用户名或密码错误");
        }
        // 关闭数据库资源
        JDBCUtil.close(rs, stmt, conn);
    }
}
