package com.zlf.dao;

import com.zlf.domain.User;
import com.zlf.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private static JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    //查找全部用户
    public List<User> findAll() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

}
