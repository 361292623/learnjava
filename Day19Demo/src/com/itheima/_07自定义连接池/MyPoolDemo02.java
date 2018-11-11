package com.itheima._07自定义连接池;

import java.sql.Connection;
import java.sql.SQLException;

/*
    使用自定以连接池获得连接对象
 */
public class MyPoolDemo02 {
    public static void main(String[] args) throws SQLException {
        // 创建连接池对象
        MyPool02 pool = new MyPool02();

        for (int i = 0; i < 11; i++) {
            // 获得连接对象(连接对象的代理对象)
            Connection conn = pool.getConnection();
            System.out.println(i+"="+conn);
            if (i == 5) {
                 // 不是真正关闭：而是将连接对象返回池中
                 conn.close();
            }
        }
    }
}
