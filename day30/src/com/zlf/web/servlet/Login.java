package com.zlf.web.servlet;

import com.zlf.domain.Admin;
import com.zlf.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码
        request.setCharacterEncoding("utf-8");
        //获取验证码
        String verifycode = request.getParameter("verifycode");
        //获取真实验证码
        String checkCode = request.getSession().getAttribute("checkCode").toString();

        if (verifycode.equalsIgnoreCase(checkCode)) {
            //验证码一致
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            AdminService adminService = new AdminService();
            Admin admin = adminService.login(username, password);
            if (admin != null) {
                //登录成功
                //将管理员的信息存放到session中
                System.out.println("登录成功");
                request.getSession().setAttribute("admin", admin);
                response.sendRedirect("index.jsp");
            } else {
                //用户名或密码错误
                System.out.println("登录失败");
                request.setAttribute("msg", "用户名或密码错误...");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            //验证码错误
            request.setAttribute("msg", "验证码错误...");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
