package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {

    //根据用户名查询用户
    User fingByUsername(String username);

    //保存用户
    void save(User User);

    //通过查询激活码查询用户
    User findByCode(String code);


    //更改用户激活状态
    void updateStatus(User user);

    //通过用户名和密码查询用户
    User findByUsernameAndPassword(String username,String password);
}
