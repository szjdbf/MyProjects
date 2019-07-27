package com.zlf.service;

import com.zlf.dao.AdminDao;
import com.zlf.domain.Admin;

public class AdminService {

    private AdminDao adminDao = new AdminDao();

    //管理员登录
    public Admin login(String username, String password) {
        return adminDao.login(username, password);
    }


}
