package com.zlf.web;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) {
        System.out.println("初始化...");
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
        System.out.println("服务已经启动....");
        //设置响应类型和编码
        response.setContentType("text/html;charset=utf-8");
        //获取输出流
        PrintWriter out = response.getWriter();
        String characterEncoding = response.getCharacterEncoding();
        System.out.println(characterEncoding);
        out.println("<h1>你好</h1>");
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
