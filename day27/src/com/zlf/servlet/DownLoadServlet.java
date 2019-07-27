package com.zlf.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/download")
public class DownLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取文件名
        String filename = request.getParameter("filename");
        //设置响应头响应类型
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        //获取输出流
        ServletOutputStream out = response.getOutputStream();
        //获取文件真实路径
        String path = getServletContext().getRealPath("img/" + filename);
        //获取输入流
        FileInputStream in = new FileInputStream(path);
        //将二进制数据写入
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
