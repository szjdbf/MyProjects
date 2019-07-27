package com.zlf.work;

import com.zlf.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
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


    //模拟用户登录
    public static void login(String username, String password) throws Exception {
        Connection conn = DBUtils.getConnection();
        //预编译的SQL执行对象
        PreparedStatement ps = conn.prepareStatement
                ("select * from user where username=? and password=password(?)");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            //获取上次登录时间;
            Timestamp lastlogintime = rs.getTimestamp("lastlogintime");
            //将当前时间写入数据库
            ps = conn.prepareStatement("update user set lastlogintime=? where username=?");
            ps.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            ps.setString(2, username);
            ps.executeUpdate();
            System.out.println("登录成功,上次登录时间为" + lastlogintime);
        } else {
            System.out.println("登录失败");
        }
        //释放资源
        DBUtils.close(rs, ps, conn);
    }
}
