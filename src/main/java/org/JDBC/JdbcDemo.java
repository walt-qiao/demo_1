package org.JDBC;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        //加载类驱动
        /*Class.forName("com.mysql.jdbc.Driver");*/
        String url = "jdbc:mysql://127.0.0.1:3306/walt";
        //数据库登录名称
        String name = "root";
        //数据库登录密码
        String passWord = "root";
        //获取链接 (Connection:可以管理事务)
        Connection connection = DriverManager.getConnection(url, name, passWord);
        //获取事务管理(false 手动提交，true 自动提交)
        connection.setAutoCommit(false);
        //声明sql
        Statement statement = null;
        int i = 0;
        int i1 = 0;
        try {
            statement = connection.createStatement();
            String sql1 = "update Student set Sage = 22 where Sid = 1";
            //int ia = 3/0;
            String sql2 = "update Student set Sage = 33 where Sid = 2";
            //执行sql
            i = statement.executeUpdate(sql1);
            i1 = statement.executeUpdate(sql2);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw new RuntimeException(e);
        }
        System.out.println(i);
        System.out.println(i1);

        statement.close();
        connection.close();

    }
}
