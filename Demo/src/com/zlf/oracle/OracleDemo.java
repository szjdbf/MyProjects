package com.zlf.oracle;

import oracle.jdbc.OracleType;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##scott", "tiger");
        System.out.println(connection);

        CallableStatement prepareCall = connection.prepareCall("{call yearsal(?)}");
        prepareCall.setObject(1,7369);

        prepareCall.registerOutParameter(1, OracleType.NUMBER);

        prepareCall.execute();

        Object object = prepareCall.getObject(1);
        System.out.println(object);

    }

}
