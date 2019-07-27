package com.zlf.dao;

import com.zlf.domain.User;
import com.zlf.utils.JDBCUtils;
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


    //添加用户
    public void add(User user) {
        String sql = "insert into user values(null,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    //删除用户
    public void del(String id) {
        String sql = "delete from user where id = ?";
        jdbcTemplate.update(sql, id);
    }

    //查询单个用户
    public User select(String id) {
        String sql = "select * from user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        return user;
    }

    //更新用户
    public void update(User user) {
        String sql = "update user set gender=?,age=?,address=?,qq=?,email=? where id=?";
        jdbcTemplate.update(sql, user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    //批量删除
    public void dels(String[] ids) {
        StringBuilder sql = new StringBuilder();
        sql.append("delete from user where id in(");
        for (int i = 0; i < ids.length - 1; i++) {
            sql.append(ids[i]);
            sql.append(",");
        }
        sql.append(ids[ids.length - 1]);
        sql.append(")");
        jdbcTemplate.update(sql.toString());
    }

    //查询用户表总条数
    public int findCount(String name, String address, String email) {
        StringBuilder sql = new StringBuilder();
        sql.append("select count(*) from user where 1=1 ");
        if (!name.equals("")) {
            sql.append("and name like '%");
            sql.append(name);
            sql.append("%' ");
        }
        if (!address.equals("")) {
            sql.append("and address like '%");
            sql.append(address);
            sql.append("%' ");
        }
        if (!email.equals("")) {
            sql.append("and email like '%");
            sql.append(email);
            sql.append("%' ");
        }
        int count = jdbcTemplate.queryForObject(sql.toString(), int.class);
        return count;
    }

    //每页的数据
    public List<User> findUserList(String currentPage, String rows, String name, String address, String email) {
        int icurrentPage = Integer.parseInt(currentPage);
        int irows = Integer.parseInt(rows);
        StringBuilder sql = new StringBuilder();
        sql.append("select * from user where 1=1 ");
        if (!name.equals("")) {
            sql.append("and name like '%");
            sql.append(name);
            sql.append("%' ");
        }
        if (!address.equals("")) {
            sql.append("and address like '%");
            sql.append(address);
            sql.append("%' ");
        }
        if (!email.equals("")) {
            sql.append("and email like '%");
            sql.append(email);
            sql.append("%' ");
        }
        sql.append("limit ?,?");
        List<User> users = jdbcTemplate.query(sql.toString(), new BeanPropertyRowMapper<>(User.class), (icurrentPage - 1) * irows, irows);
        return users;
    }

}
