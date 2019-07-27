package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;


public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = new CategoryDaoImpl();

    //返回分类的json格式
    @Override
    public String getCategoryJson() {
        //从redis查询缓存
        Jedis jedis = JedisUtil.getJedis();
        String category = jedis.get("category");
        if (category != null) {
            //如果有数据,直接返回
            return category;
        } else {
            //从数据库查询数据,并将集合转化为json
            List<Category> categoryList = categoryDao.findAll();
            ObjectMapper mapper = new ObjectMapper();
            try {
                category = mapper.writeValueAsString(categoryList);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //将json存到redis中
            jedis.set("category", category);
            return category;
        }
    }
}
