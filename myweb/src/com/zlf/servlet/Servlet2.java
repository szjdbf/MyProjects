package com.zlf.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s2")
public class Servlet2 implements Servlet {
    @Override
    public void init(ServletConfig config) {
        System.out.println(config);
        String servletName = config.getServletName();
        System.out.println("servletName  ---> " + servletName);
        ServletContext servletContext = config.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
