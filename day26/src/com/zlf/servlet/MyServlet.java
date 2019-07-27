package com.zlf.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        //获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println("contextPath--->   " + contextPath);

        //获取URI(统一资源标识符)
        String requestURI = request.getRequestURI();
        System.out.println("requestURI--->" + requestURI);

        //获取客户端IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);

        //获取URL(统一资源定位符)
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);

        System.out.println(request.getHeader("user-agent"));
        System.out.println(request.getHeader("referer"));
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }
}
