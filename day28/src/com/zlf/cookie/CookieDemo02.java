package com.zlf.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie2")
public class CookieDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Cookie
        Cookie[] cookies = request.getCookies();
        //需要非空判断
        if (cookies != null) {
            //遍历Cookie
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + "  :  " + cookie.getValue());
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
