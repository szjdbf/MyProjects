package com.zlf.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class ListenerDemo01 implements ServletContextListener {

    //当服务器开启时,ServletContext对象创建,该方法执行
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println(username);
        String password = servletContext.getInitParameter("password");
        System.out.println(password);
        String location = servletContext.getInitParameter("location");
        System.out.println(location);
    }

    //当服务器关闭时,ServletContext对象销毁,该方法执行
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("销毁...");
    }
}
