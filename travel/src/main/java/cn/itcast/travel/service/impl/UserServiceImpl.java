package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    //用户注册
    @Override
    public boolean regist(User user) {
        User u = userDao.fingByUsername(user.getUsername());
        if (u == null) {//用户名不存在
            //设置激活码和激活状态
            user.setCode(UuidUtil.getUuid());
            user.setStatus("N");
            //保存用户信息
            userDao.save(user);
            //发送激活邮件
            String content = "黑马旅游网注册:<a href='http://localhost:8080/user/active?code=" + user.getCode() + "'>点击激活</a>";
            MailUtils.sendMail(user.getEmail(), content, "黑马旅游网激活注册");
            return true;
        } else {
            //用户名存在
            return false;
        }
    }

    //用户激活
    @Override
    public boolean active(String code) {
        //根据激活码查询用户
        User user = userDao.findByCode(code);
        if (user != null) {
            //改变激活状态
            userDao.updateStatus(user);
            return true;
        }
        return false;
    }

    //用户登录
    @Override
    public User login(User user) {
        return userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
