package com.zlf.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/b")
public class ServletB extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("bbbbbb");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        doPost(request, response);
    }
}
