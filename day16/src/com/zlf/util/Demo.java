package com.zlf.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        sc.close();
        login(username, password);
    }

    public static void login(String username, String password) throws Exception {
        //获取连接
        Connection conn = DBUtils.getConnection();
        //预编译的SQL执行对象
        PreparedStatement ps = conn.prepareStatement
                ("select * from user where username=? and password=password(?)");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        //释放资源
        DBUtils.close(rs, ps, conn);
    }

//    public void login(String username,String password) throws Exception{
//        //获取连接
//        Connection conn = DBUtils.getConnection();
//        //SQL执行对象
//        Statement st = conn.createStatement();
//        String sql = "select * from user where username='" + username + "' and password=PASSWORD('" + password + "')";
//        System.out.println(sql);
//        ResultSet rs = st.executeQuery(sql);
//        if (rs.next()) {
//            System.out.println("登录成功");
//        } else {
//            System.out.println("登录失败");
//        }
//        //释放资源
//        DBUtils.close(rs, st, conn);
//    }
}