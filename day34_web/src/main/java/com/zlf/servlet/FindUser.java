package com.zlf.servlet;

import com.zlf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findUser")
public class FindUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询数据库/缓存
        UserService userService = new UserService();
        //返回json字符串
        String json = userService.findUserJson();
        //设置响应格式
        response.setContentType("test/json;charset=utf-8");
        //响应json字符串
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
