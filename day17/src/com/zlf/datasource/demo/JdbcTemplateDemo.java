package com.zlf.datasource.demo;

import com.zlf.datasource.po.Emp;
import com.zlf.datasource.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo {

    @Test
    public void testInsert() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        //执行
        int i = jt.update(sql, null, "张无忌", 3, 1006, "2010-09-09", 606.66, 1000.56, 10);
        System.out.println(i);
    }

    @Test
    public void testUpdate() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "update emp set ename =? where id=?";
        //执行
        int i = jt.update(sql, "周芷若", 1015);
        System.out.println(i);
    }


    @Test
    public void testDelete() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "delete from emp where id in (?,?)";
        //执行
        int i = jt.update(sql, 1017, 1016);
        System.out.println(i);
    }


    @Test
    public void testQueryForMap() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "select * from emp where id=?";
        //查询单行记录使用queryForMap,键为字段名,值为数据值
        Map<String, Object> map = jt.queryForMap(sql, 1013);
        System.out.println(map);
    }

    @Test
    public void testQueryForList() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "select * from emp";
        //查询多行记录用queryForList
        List<Map<String, Object>> maps = jt.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void testQuery() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "select * from emp where id<?";
        List<Emp> emps = jt.query(sql, new Object[]{1010},new BeanPropertyRowMapper<>(Emp.class) );
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }


    @Test
    public void testQueryForObject() {
        //创建JDBCTemplate对象,传入数据源
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建SQL语句
        String sql = "select avg(salary) from emp";
        //使用聚合函数
        Double d = jt.queryForObject(sql, double.class);
        System.out.println(d);
    }
}
