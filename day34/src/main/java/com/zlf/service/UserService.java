package com.zlf.service;

import com.zlf.dao.UserDao;
import com.zlf.domain.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public List<User> findAll() {
        return userDao.findAll();
    }


}
