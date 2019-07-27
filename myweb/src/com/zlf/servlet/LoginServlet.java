package com.zlf.servlet;

import com.zlf.dao.UserDao;
import com.zlf.po.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //设置响应格式
        response.setContentType("text/html;charset=utf-8");
        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取用户输入的验证码
        String checkcode = request.getParameter("checkcode");
        //获取Session的验证码
        String realcode = (String) request.getSession().getAttribute("checkcode");
        if (checkcode.equalsIgnoreCase(realcode)) {
            //判断用户名和密码是否正确
            UserDao userDao = new UserDao();
            User user = userDao.login(username, password);
            //获取响应输出流
            PrintWriter out = response.getWriter();
            if (user != null) {
                out.write("登录成功,上次登录时间为 " + user.getLastlogin());
            } else {
                request.setAttribute("msg", "用户名和密码错误,请重新输入...");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("msg", "验证码错误,请重新输入...");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
