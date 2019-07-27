package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Category> findAll() {
        String sql = "select * from tab_category order by cid";
        List<Category> categoryList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Category.class));

        for (Category category : categoryList) {
            System.out.println(category);
        }

        return categoryList;
    }
}
