package com.zlf.web.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@WebFilter("/*")
public class FilterDemo03 implements Filter {
    private List<String> list;

    @Override
    public void init(FilterConfig filterConfig) {
        list = new ArrayList<>();
        InputStream in = FilterDemo03.class.getClassLoader().getResourceAsStream("msg.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
        String str;
        try {
            while ((str = br.readLine()) != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //过滤所有的脏话
    @Override
    public void doFilter(ServletRequest req, ServletResponse reps, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) reps;
        //获取请求参数
        String msg = request.getParameter("msg");
        ServletRequest o;
        if (msg != null) {
            //获取request的代理对象
            o = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.getName().equals("getParameter")) {
                        String msg = req.getParameter("msg");
                        //判断是否是脏话
                        for (String s : list) {
                            if (msg.contains(s)) {
                                msg = msg.replaceAll(s, "***");
                            }
                        }
                        return msg;
                    } else {
                        return method.invoke(req, args);
                    }
                }
            });
        } else {
            o = req;
        }
        chain.doFilter(o, reps);
    }


    @Override
    public void destroy() {

    }

}

