package com.zlf.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/set")
public class SetSession extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Session是服务器端会话技术,将数据保存在服务器的对象中
        //Session是基于Cookie的
        //获取Session对象
        HttpSession session = request.getSession();
        //持久化存放,设置Cookie中的JSESSIONID的存放时间
        Cookie c = new Cookie("JSESSIONID", session.getId());
        c.setMaxAge(60 * 10);
        response.addCookie(c);
        //存放数据
        session.setAttribute("用户名", "张三");
        response.getWriter().write("Success");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
