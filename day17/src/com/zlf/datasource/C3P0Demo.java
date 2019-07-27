package com.zlf.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo {
    public static void main(String[] args) throws SQLException, InterruptedException {
        //连接池对象
        ComboPooledDataSource ds = new ComboPooledDataSource();
        //获取连接
        for (int i = 0; i < 6; i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn);
            if (i == 3) {
                conn.close();
                Thread.sleep(1000);
            }
        }

    }

}
