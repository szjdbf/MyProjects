package com.zlf.proxy.静态代理;

import java.lang.reflect.Method;

public class UserDao {

    public void save(int i) {
        System.out.println("保存成功");
        System.out.println(i);
    }


    public static void main(String[] args) throws Exception {
       UserDao userDao = new UserDao();
        //userDao.save();


        Class cls = UserDao.class;
        Method method = cls.getMethod("save",int.class);
        method.invoke(cls.newInstance(),10);
    }
}
