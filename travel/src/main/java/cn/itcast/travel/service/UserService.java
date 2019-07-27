package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {

    //用户注册
    boolean regist(User user);

    //用户激活
    boolean active(String code);

    //用户登录
    User login(User user);
}
