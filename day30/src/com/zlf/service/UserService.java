package com.zlf.service;

import com.zlf.dao.UserDao;
import com.zlf.domain.PageBean;
import com.zlf.domain.User;

import java.util.List;
import java.util.Map;

public class UserService {
    private UserDao userDao = new UserDao();

    public List<User> findAll() {
        return userDao.findAll();
    }


    //添加用户
    public void add(User user) {
        userDao.add(user);
    }

    //删除用户
    public void del(String id) {
        userDao.del(id);
    }

    public User select(String id) {
        User user = userDao.select(id);
        return user;
    }


    public void update(User user) {
        userDao.update(user);
    }

    //批量删除
    public void dels(String[] ids) {
        userDao.dels(ids);
    }


    //分页操作
    public PageBean getPageBean(String currentPage, String rows, String name, String address, String email) {
        int icurrentPage = Integer.parseInt(currentPage);
        int irows = Integer.parseInt(rows);

        //在业务逻辑层封装PageBean,数据库操作由Dao层来执行
        PageBean pageBean = new PageBean();
        //当前页码
        pageBean.setCurrentPage(icurrentPage);
        //每页显示的条数
        pageBean.setRows(irows);
        //总条数
        int totalCount = userDao.findCount(name, address, email);
        pageBean.setTotalCount(totalCount);
        //总页数
        int totalPage = totalCount % irows == 0 ? totalCount / irows : totalCount / irows + 1;
        pageBean.setTotalPage(totalPage);
        //每页的数据
        List<User> users = userDao.findUserList(currentPage, rows, name, address, email);
        pageBean.setUsers(users);

        return pageBean;
    }

}
