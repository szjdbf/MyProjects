package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    //根据用户名查询用户
    @Override
    public User fingByUsername(String username) {
        String sql = "select * from tab_user where username = ?";
        try {
            //查询数据库
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
        } catch (Exception e) {
            //没有查到
            return null;
        }
    }

    //保存用户
    @Override
    public void save(User user) {
        String sql = "insert into tab_user (username,password,name,sex,telephone,email,birthday,code,status) values (?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getName(),
                user.getSex(), user.getTelephone(), user.getEmail(), user.getBirthday(), user.getCode(), user.getStatus());
    }

    //通过查询激活码查询用户
    @Override
    public User findByCode(String code) {
        String sql = "select * from tab_user where code = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), code);
        } catch (Exception e) {
            return null;
        }

    }

    //更改用户激活状态
    @Override
    public void updateStatus(User user) {
        String sql = "update tab_user set status ='Y' where uid = ?";
        jdbcTemplate.update(sql, user.getUid());
    }

    //用户登录
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        String sql = "select * from tab_user where username=? and password=?";
        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        } catch (Exception e) {
            return null;
        }
    }
}
