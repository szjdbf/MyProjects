package com.zlf.dao;

import com.zlf.po.User;
import com.zlf.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 用户数据库访问
 */
public class UserDao {
    private static JdbcTemplate jdbcTemplate;

    static {
        jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    }

    public User login(String username, String password) {
        String sql = "select * from user where username=? and password=?";
        try {
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
            //设置登录时间
            sql = "update user set lastlogin=? where id=?";
            jdbcTemplate.update(sql, null, user.getId());
            return user;
        } catch (Exception e) {
            return null;
        }
    }

}
