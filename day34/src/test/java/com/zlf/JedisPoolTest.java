package com.zlf;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Jedis连接池
 */
public class JedisPoolTest {

    public static void main(String[] args) {
        //Jedis连接池
        JedisPool pool = new JedisPool();
        //从连接池中获取连接对象
        Jedis jedis = pool.getResource();
        System.out.println(jedis);
    }
}
