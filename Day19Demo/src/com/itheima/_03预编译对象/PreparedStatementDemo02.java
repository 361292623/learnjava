package com.itheima._03预编译对象;

import com.itheima._02SQL注入.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
    使用PreparedStatement对象执行查询操作
    查询id小于10的学生信息,并保存将每一个记录封装成一个学生对象存储到List集合中
 */
public class PreparedStatementDemo02 {
   public static void main(String[] args) throws SQLException {
        // 获得连接对象
       Connection conn = JDBCUtil.getConnection();
       // 获得预编译对象
       PreparedStatement ps = conn.prepareStatement("select * from student where id < ?;");
       // 给问号赋值
       ps.setInt(1, 10);
       // 执行查询操作
       ResultSet rs = ps.executeQuery();
       // 创建集合用来存储学生对象
       List<Student> list = new ArrayList<>();
       while (rs.next()){
           // 获得每一列的值
           int id = rs.getInt("id");
           String name = rs.getString("name");
           String gender = rs.getString("gender");
           Date birthday = rs.getDate("birthday");

           // 创建一个学生对象
           Student stu = new Student(id,name,gender,birthday);
           // 将学生添加到集合中
           list.add(stu);
       }
       // 遍历集合输出学生对象
       list.forEach(System.out::println);

       // 关闭资源
       JDBCUtil.close(rs,ps,conn);
   }
}
