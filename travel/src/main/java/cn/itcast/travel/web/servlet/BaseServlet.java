package cn.itcast.travel.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 重写HttpServlet的service方法,,完成方法的分发
         */
        //获取请求URI
        String uri = request.getRequestURI();
        //获取请求的方法
        String methodName = uri.substring(uri.lastIndexOf('/') + 1);

        //通过反射执行方法
        try {
            //获取方法
            Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //执行方法
            method.invoke(this, request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
