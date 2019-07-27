package com.zlf.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2",
                "root", "123456");
        //获取数据库执行语句对象
        Statement st = conn.createStatement();
        //添加数据
//        String sql = "insert into emp (id,ename,job_id,mgr,joindate,salary,bonus,dept_id) values(null,'张杰',4,null,'1997-12-15',2000,10000,10)";
//        int i = st.executeUpdate(sql);
//        System.out.println(i);
        //删除数据
        String sql2="delete from emp where ename='小白龙'";
        int i2=st.executeUpdate(sql2);
        System.out.println(i2);

        st.close();
        conn.close();
    }

}
