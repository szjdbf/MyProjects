package com.zlf.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询
 */
public class DQLDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "123456");
            //获取数据库执行语句对象
            st = conn.createStatement();
            //存放Emp的集合
            List<Emp> list = new ArrayList<>();
            //将数据放到结果集中
            rs = st.executeQuery("select * from emp");
            while (rs.next()) {
                Emp e = new Emp(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDate(5),
                        rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
                list.add(e);
            }
            for (Emp emp : list) {
                System.out.println(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (st != null)
                    st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
