package com.zlf.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie是客户端会话技术
 */
@WebServlet("/cookie1")
public class CookieDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie,并相应给浏览器
        Cookie c = new Cookie("china", "华为");
        //设置Cooki保存时间,默认存放在浏览器内存中,关闭后被销毁
        //>0:持久化存储
        //=0:删除Cookie信息
        //<0:默认
        c.setMaxAge(60 * 60 * 24 * 365 * 10);
        //设置Cookie共享范围,默认是当前项目下
        //若要当前服务器下都可以共享,则可以设置为/
        //c.setPath("/");
        response.addCookie(c);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}