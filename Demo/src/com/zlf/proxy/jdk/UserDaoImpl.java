package com.zlf.proxy.jdk;

/**
 * 目标类
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据中...");
    }
}
