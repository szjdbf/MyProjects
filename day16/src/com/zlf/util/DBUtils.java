package com.zlf.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtils {
    private static String url;
    private static String username;
    private static String password;

    static {
        Properties p = new Properties();
        InputStream in = DBUtils.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            p.load(in);
            in.close();
            url = p.getProperty("url");
            username = p.getProperty("username");
            password = p.getProperty("password");
            String driver = p.getProperty("driver");
            //加载驱动
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    //释放资源
    public static void close(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
