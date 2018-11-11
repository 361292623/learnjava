package com.itheima._07自定义连接池;

import java.sql.Connection;
import java.sql.SQLException;

/*
    使用自定以连接池获得连接对象
 */
public class MyPoolDemo01 {
    public static void main(String[] args) throws SQLException {
        // 创建连接池对象
        MyPool01 pool = new MyPool01();

        for (int i = 0; i < 11; i++) {
            // 获得连接对象
            Connection conn = pool.getConnection();
            System.out.println(i+"="+conn);
            if (i == 5) {
                 // 将连接对象返回池中
                 pool.close(conn);
            }
        }
    }
}
