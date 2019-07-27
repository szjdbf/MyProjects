package com.zlf.web.filter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(value = "/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        //获取请求URI

        String uri = req.getRequestURI();
        System.out.println(uri);
        if (uri.contains("/login") || uri.contains("/css/") || uri.contains("/js/") || uri.contains("/fonts/") || uri.contains("/checkCode")) {
            //放行
            chain.doFilter(request, response);
        } else {
            //判断Session
            HttpSession session = req.getSession();
            Object admin = session.getAttribute("admin");
            if (admin != null) {
                //放行
                chain.doFilter(request, response);
            } else {
                //重定向到登录页
                res.sendRedirect("login.jsp");
            }
        }
    }

    @Override
    public void destroy() {

    }
}
