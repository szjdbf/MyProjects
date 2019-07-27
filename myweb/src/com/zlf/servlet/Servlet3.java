package com.zlf.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/s3")
public class Servlet3 extends HttpServlet {

    //收到请求
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(this.getServletConfig());
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

    //当服务器启动或者收到请求时
    @Override
    public void init() {
        System.out.println("init()方法被调用...");
    }

    //服务器关闭
    @Override
    public void destroy() {
        System.out.println("destory()方法被调用...");
    }
}
