package com.zlf.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            //加载配置文件
            Properties p = new Properties();
            p.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //通过Druid工厂类创建数据源对象
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 获取数据源
     */
    public static DataSource getDataSource() {
        return ds;
    }


    /**
     * 释放资源
     */
    public static void close(Statement st, Connection conn) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close();//归还连接
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close(st, conn);
    }
}
