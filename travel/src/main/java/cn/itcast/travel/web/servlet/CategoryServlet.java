package cn.itcast.travel.web.servlet;

import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/category/*")
public class CategoryServlet extends BaseServlet {
    private CategoryService categoryService = new CategoryServiceImpl();

    public void findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String categoryJson = categoryService.getCategoryJson();
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(categoryJson);
    }

}
