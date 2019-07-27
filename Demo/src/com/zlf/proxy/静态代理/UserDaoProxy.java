package com.zlf.proxy.静态代理;

/**
 * 代理类
 */
public class UserDaoProxy implements IUserDao {
    //接受保存目标对象
    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("验证身份");
        userDao.save();//执行目标对象的方法
        System.out.println("成功...");
    }
}
