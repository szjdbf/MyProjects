package com.zlf.dao;

import com.zlf.domain.Admin;
import com.zlf.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class AdminDao {
    private static JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    //管理员登录
    public Admin login(String username, String password) {
        String sql = "select * from admin where username=? and password=?";
        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Admin.class), username, password);
        } catch (Exception e) {
            return null;
        }
    }

}
