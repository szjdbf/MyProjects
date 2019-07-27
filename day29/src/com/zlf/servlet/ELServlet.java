package com.zlf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/toel")
public class ELServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //在Request域中存放数据
        request.setAttribute("username", "张三");
        //在Session域中存放数据
        request.getSession().setAttribute("username", "李四");
        //在ServletContext域中存放数据
        this.getServletContext().setAttribute("server", "tomcat");

        //转发
        request.getRequestDispatcher("el.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
