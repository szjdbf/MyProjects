package com.zlf.datasource.practice;

import com.zlf.datasource.po.Emp;
import com.zlf.datasource.util.JDBCUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class PracticeDemo {

    private JdbcTemplate jt;

    @Before
    public void before() {
        jt = new JdbcTemplate(JDBCUtils.getDataSource());
    }

    @Test
    public void test1() {
        //修改孙悟空的工资为1000
        String sql = "update emp set salary=? where ename=?";
        jt.update(sql, 10000, "孙悟空");
    }

    @Test
    public void test2() {
        //查询id为1007的员工，将其封装为Map集合
        String sql = "select * from emp where id=?";
        Map<String, Object> map = jt.queryForMap(sql, 1007);
        System.out.println(map);
    }

    @Test
    public void test3() {
        //查询财务部所有员工，将其封装为List集合
        String sql = "select * from emp where dept_id=(select id from dept where dname=?)";
        List<Map<String, Object>> lists = jt.queryForList(sql, "学工部");
        for (Map<String, Object> map : lists) {
            System.out.println(map);
        }
    }

    @Test
    public void test4() {
        //查询工资大于20000的所有员工，封装为Emp对象的List集合
        String sql = "select * from emp where salary>?";
        List<Emp> emps = jt.query(sql, new Object[]{20000}, new BeanPropertyRowMapper<>(Emp.class));
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void test5() {
        //查询财务部的最高工资
        String sql = "select max(salary) from emp where dept_id=(select id from dept where dname=?) ";
        Double d = jt.queryForObject(sql, new Object[]{"学工部"}, Double.class);
        System.out.println(d);
    }
}
