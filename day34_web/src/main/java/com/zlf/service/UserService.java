package com.zlf.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zlf.dao.UserDao;
import com.zlf.domain.User;
import redis.clients.jedis.Jedis;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public String findUserJson() {
        //先从redis中查询
        Jedis jedis = new Jedis();
        String json = jedis.get("aaa");
        if (json == null) {
            List<User> users = userDao.findUser();
            ObjectMapper mapper = new ObjectMapper();
            try {
                //将集合转化为json字符串
                json = mapper.writeValueAsString(users);
                jedis.set("aaa", json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            System.out.println("从数据库查询");
        } else {
            System.out.println("从缓存中查询");
        }
        return json;
    }


}
