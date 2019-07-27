package com.zlf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/toel2")
public class EL2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        request.setAttribute("list", list);

        Map<String, String> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "123456");
        request.setAttribute("map", map);

        request.getRequestDispatcher("el2.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
