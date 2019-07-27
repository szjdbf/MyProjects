package com.zlf;

import com.zlf.dao.UserDao;
import com.zlf.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void findAllTest() {
        UserDao userDao = new UserDao();
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
