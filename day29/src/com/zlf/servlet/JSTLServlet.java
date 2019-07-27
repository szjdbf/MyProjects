package com.zlf.servlet;

import com.zlf.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jstl")
public class JSTLServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        users.add(new User(1001, "张无忌", "男"));
        users.add(new User(1002, "周芷若", "女"));
        users.add(new User(1003, "赵敏", "女"));

        request.setAttribute("users", users);
        request.getRequestDispatcher("foreach.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
