package com.zlf.web.servlet;

import com.zlf.domain.PageBean;
import com.zlf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/userPageServlet")
public class UserPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取当前页码和每页显示的条数
        String currentPage = request.getParameter("currentPage");
        String rows = request.getParameter("rows");
        //获取模糊查询的参数
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");

        if (currentPage == null) {
            currentPage = "1";

        }
        if (rows == null) {
            rows = "5";
        }

        if (name == null) {
            name = "";
        }
        if (address == null) {
            address = "";
        }
        if (email == null) {
            email = "";
        }


        UserService userService = new UserService();
        PageBean pageBean = userService.getPageBean(currentPage, rows, name, address, email);
        //将PageBean存放到Request域中
        request.setAttribute("pageBean", pageBean);
        //查询的参数存到Request域中
        request.setAttribute("name", name);
        request.setAttribute("address", address);
        request.setAttribute("email", email);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
