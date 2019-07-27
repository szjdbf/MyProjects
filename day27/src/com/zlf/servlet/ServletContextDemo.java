package com.zlf.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletcontext")
public class ServletContextDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext对象
        //ServletContext context = request.getServletContext();
        ServletContext context = getServletContext();
        //G:\IdeaProjects\out\artifacts\day27_war_exploded\abc.jpg
        String realPath = context.getRealPath("abc.jpg");
        System.out.println(realPath);


//        String mimeType = context.getMimeType("abc.jpg");//image/jpeg
//        System.out.println(mimeType);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
