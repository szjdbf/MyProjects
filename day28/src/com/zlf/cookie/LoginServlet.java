package com.zlf.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置响应类型
        response.setContentType("text/html;charset=utf-8");
        //获取当前时间字符串格式
        String now = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss").format(new Date());

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lastTime")) {
                    //获取上次登录时间
                    String time = cookie.getValue();
                    response.getWriter().write("欢迎您,您上次登录时间为" + time.replace("/", " "));
                    //将当前时间保存到Cookie中
                    response.addCookie(new Cookie("lastTime", now));
                    //结束
                    return;
                }
            }
        }
        //首次登录
        response.addCookie(new Cookie("lastTime", now));
        response.getWriter().write("您是首次登录");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
