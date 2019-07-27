package com.zlf.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties p = new Properties();
        p.load(DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties"));
        //通过Druid工厂类创建数据源对象
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
        Connection conn2 = ds.getConnection();
        System.out.println(conn2);
    }
}
