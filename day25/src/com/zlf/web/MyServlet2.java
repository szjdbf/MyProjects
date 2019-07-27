package com.zlf.web;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

//注解配置
@WebServlet(value = "/myservlet2", loadOnStartup = 0/*服务器启动时加载*/)
public class MyServlet2 implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) {
        System.out.println("初始化2...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 服务端接受客户端请求会调用该方法
     */
    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        System.out.println("服务2已经启动....");
        //设置响应类型和编码
        response.setContentType("text/html;charset=utf-8");
        //获取输出流
        PrintWriter out = response.getWriter();
        String characterEncoding = response.getCharacterEncoding();
        System.out.println(characterEncoding);
        out.println("<h1>Hello</h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("被销毁...");
    }
}
