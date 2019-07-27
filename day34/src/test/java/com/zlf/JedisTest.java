package com.zlf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * Redis测试类
 */
public class JedisTest {

    public Jedis jedis;

    /**
     * 在所有方法执行前执行
     */
    @Before
    public void before() {
        //1.获取连接;
        jedis = new Jedis();//默认localhost:6379
    }

    /**
     * 在所有方法执行后执行
     */
    @After
    public void after() {
        //3.关闭连接
        jedis.close();
    }


    @Test
    public void test1() {
        //2.存数据
        jedis.set("username", "wangwu");
    }

    @Test
    public void test2() {
        //获取数据
        String username = jedis.get("username");
        System.out.println(username);
    }


    @Test
    public void test3() {
        //指定过期时间
        jedis.setex("age", 20, "hello");
    }

    /**
     * 存放hash数据(map键值对)
     */
    @Test
    public void test4() {
        jedis.hset("user", "name", "zhannsan");
        jedis.hset("user", "age", "15");
        jedis.hset("user", "birth", "1997-12-15");
    }

    @Test
    public void test5() {
        Map<String, String> user = jedis.hgetAll("user");
        System.out.println(user);
    }

    /**
     * 存放set数据
     */
    @Test
    public void test6(){
        jedis.sadd("set","abc","java","php","c#");
    }
}
