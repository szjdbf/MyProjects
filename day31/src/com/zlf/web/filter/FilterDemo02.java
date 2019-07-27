package com.zlf.web.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//@WebFilter("/*")//拦截所有请求
//@WebFilter("/user/*")//拦截指定目录下的
//@WebFilter("*.jsp")//拦截所有的jsp
//@WebFilter("/aaa.jsp)//拦截指定的
public class FilterDemo02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter()...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
