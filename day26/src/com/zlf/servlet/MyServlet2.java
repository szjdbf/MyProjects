package com.zlf.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/s2")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*
             get不会出现乱码,post会出现乱码,需要设置request的编码格式
         */
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + "   " + password);


        Map<String, String[]> map = request.getParameterMap();
        for (String s : map.keySet()) {
            String[] value = map.get(s);
            System.out.println(s + "\t\t" + Arrays.toString(value));
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
