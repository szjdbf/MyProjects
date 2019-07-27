package com.zlf.web.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")//表示拦截所有请求
public class FilterDemo01 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤器执行了");
        resp.setContentType("text/html;charset=utf-8");
        //允许访问
        chain.doFilter(req, resp);
        //回来...
        System.out.println(resp.getContentType());
        System.out.println("回来");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
